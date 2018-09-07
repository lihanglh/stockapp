package cn.hankli.stockapp.trade.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.hankli.stockapp.trade.model.deal.SellRequest;


@Repository
public interface SellRequestMapper {

	void create(SellRequest sellRequest);
	ArrayList<SellRequest> findAll();
	ArrayList<SellRequest> findByCode(String code);
	
}
