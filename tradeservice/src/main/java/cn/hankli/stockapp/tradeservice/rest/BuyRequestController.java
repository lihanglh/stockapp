package cn.hankli.stockapp.tradeservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.data.deal.BuyRequest;
import cn.hankli.stockapp.data.deal.BuyRequestRepository;

@RestController
@RequestMapping("/buyrequest")
public class BuyRequestController {

	@Autowired
	private BuyRequestRepository buyRequestRepository;
	
	
	@PostMapping(consumes="application/json", produces="application/json")
	public BuyRequest submit(@RequestBody BuyRequest buyRequest) {
		
		return buyRequestRepository.save(buyRequest);
		
	}

	
	
	
}
