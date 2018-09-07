package cn.hankli.stockapp.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.trade.model.deal.SellRequest;
import cn.hankli.stockapp.trade.repository.SellRequestMapper;

@RestController
@RequestMapping("/sellrequest")
public class SellRequestController {

	@Autowired
	private SellRequestMapper sellRequestMapper;
	
	
	@PostMapping(consumes="application/json", produces="application/json")
	public void submit(@RequestBody SellRequest sellRequest) {
		
		sellRequestMapper.create(sellRequest);
		
	}
	
}
