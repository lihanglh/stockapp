package cn.hankli.stockapp.trade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cn.hankli.stockapp.trade.model.stock.StockPrice;

@Service
public class BuyRequestService {

	@Autowired
	RestTemplate restTemplate;

	//@HystrixCommand(fallbackMethod = "reliable")
	public StockPrice getStockPrice(String code) {

		ResponseEntity<StockPrice> entity;

		entity = restTemplate.getForEntity("http://queryservice/stockprice/{code}", StockPrice.class, code);

		return entity.getBody();

	}
	
	
	public StockPrice reliable(String code) {
		
		return null;
	}
	
}
