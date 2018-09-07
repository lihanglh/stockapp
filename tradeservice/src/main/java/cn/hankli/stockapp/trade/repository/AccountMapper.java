package cn.hankli.stockapp.trade.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.hankli.stockapp.trade.model.account.Account;



@Repository
public interface AccountMapper {
	
	ArrayList<Account> findAll();
	Account findByIdNo(String idNo);
	void createAccount(Account account);

}
