package cn.hankli.stockapp.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hankli.stockapp.trade.model.account.Account;
import cn.hankli.stockapp.trade.repository.AccountMapper;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountMapper accountMapper;
	

	@PostMapping(consumes="application/json", produces="application/json")
	public void submit(@RequestBody Account account) {
		
		accountMapper.createAccount(account);
		
	}

	@GetMapping(path="/{idNo}")
	public Account findByIdNo(@PathVariable String idNo) {
		
		return accountMapper.findByIdNo(idNo);
		
	}
	
}
