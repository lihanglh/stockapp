package cn.hankli.stockapp.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.trade.model.deal.BuyRequest;
import cn.hankli.stockapp.trade.model.stock.StockPrice;
import cn.hankli.stockapp.trade.repository.BuyRequestMapper;
import cn.hankli.stockapp.trade.service.BuyRequestService;

@RestController
@RequestMapping("/buyrequest")
public class BuyRequestController {

	@Autowired
	private BuyRequestMapper buyRequestMapper;
	
	@Autowired
	private BuyRequestService buyRequestService;
	
	
	@PostMapping(consumes="application/json", produces="application/json")
	public void submit(@RequestBody BuyRequest buyRequest) {
		
		buyRequestMapper.create(buyRequest);
		
	}

	@GetMapping(path="/{code}", produces="application/json")
	public StockPrice showForm(@PathVariable String code) {
		
		return buyRequestService.getStockPrice(code);
		
	}
	
	
	
	
	
}
