package cn.hankli.stockapp.tradeservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.data.deal.SellRequest;
import cn.hankli.stockapp.data.deal.SellRequestRepository;

@RestController
@RequestMapping("sellrequest")
public class SellRequestController {

	@Autowired
	private SellRequestRepository sellRequestRepository;
	
	
	@PostMapping(consumes="application/json", produces="application/json")
	public SellRequest submit(@RequestBody SellRequest sellRequest) {
		
		return sellRequestRepository.save(sellRequest);
		
	}
	
}
