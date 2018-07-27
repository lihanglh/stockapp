package cn.hankli.stockapp.queryservice.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.hankli.stockapp.data.StockPrice;
import cn.hankli.stockapp.data.StockPriceRepository;

@Controller
public class PriceController {

	@Autowired
	private StockPriceRepository priceRepository;

	@GetMapping(produces="application/html", path="/price/{code}")
	public String greeting(@PathVariable String code, Model model) {

		final String USER_AGENT = "Mozilla/5.0";
		final String GET_URL = "http://hq.sinajs.cn/list=";

		String response = null;

		try {

			URL obj = new URL(GET_URL + code);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			StringBuffer responseBuf = null;

			if (responseCode == HttpURLConnection.HTTP_OK) { // success

				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "GBK"));
				String inputLine;
				responseBuf = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					responseBuf.append(inputLine);
				}

				in.close();

				response = responseBuf.toString();

			} else {

			}

		} catch (Exception ex) {

		}

		if (response != null) {

			StockPrice price = splitPrice(response);

			priceRepository.save(price);

			model.addAttribute("result", response);

			model.addAttribute("price", price.getPrice());

		} else {

			model.addAttribute("result", "error");
		}

		return "single_result";

	}

	/*
	 * 
	 */
	private StockPrice splitPrice(String result) {

		StockPrice price;
		String token[];

		price = new StockPrice();

		token = result.substring(result.indexOf('\"')+1).split(",");

		price.setStockName(token[0]);
		price.setPrice(Double.parseDouble(token[3]));
		price.setTime(new Timestamp(System.currentTimeMillis()));

		return price;
	}

}
