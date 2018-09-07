package cn.hankli.stockapp.trade.model.deal;

import java.sql.Timestamp;

import cn.hankli.stockapp.trade.model.account.Account;

public class SellRequest {
	
	private long id;
	
	private Account account;
	
	private String name;
	
	private String code;
	
	private double price;
	
	private int number;

	private Timestamp timestamp;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
