package cn.hankli.stockapp.data.deal;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cn.hankli.stockapp.data.account.Account;

@Entity
@Table(name = "buy_req")
public class BuyRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Account account;
	
	@Column(name="name")
	private String stockName;
	
	@Column(name="code")
	private String code;
	
	@ManyToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="acct_id", referencedColumnName="id")
	private int amount;
	
	private Timestamp time;
	
	private double price;
	
	public BuyRequest() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
