package cn.hankli.stockapp.trade.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.hankli.stockapp.trade.model.deal.BuyRequest;

@Repository
public interface BuyRequestMapper {
	
	void create(BuyRequest buyRequest);
	ArrayList<BuyRequest> findAll();
	ArrayList<BuyRequest> findByCode(String code);

}
