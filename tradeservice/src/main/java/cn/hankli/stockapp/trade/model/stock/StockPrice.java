package cn.hankli.stockapp.trade.model.stock;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class StockPrice {

	Long id;
	String code;
	String name;
	Float todayOpenPrice;
	Float lastClosePrice;
	Float currentPrice;
	Float highestPrice;
	Float lowestPrice;
	Float bidPrice;
	Float auctionPrice;
	Long dealNumber;
	Double dealAmount;
	Date date;
	Time time;
	Timestamp timestamp;
	
	public StockPrice() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTodayOpenPrice() {
		return todayOpenPrice;
	}

	public void setTodayOpenPrice(Float todayOpenPrice) {
		this.todayOpenPrice = todayOpenPrice;
	}

	public Float getLastClosePrice() {
		return lastClosePrice;
	}

	public void setLastClosePrice(Float lastClosePrice) {
		this.lastClosePrice = lastClosePrice;
	}

	public Float getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Float getHighestPrice() {
		return highestPrice;
	}

	public void setHighestPrice(Float highestPrice) {
		this.highestPrice = highestPrice;
	}

	public Float getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(Float lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public Float getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(Float bidPrice) {
		this.bidPrice = bidPrice;
	}

	public Float getAuctionPrice() {
		return auctionPrice;
	}

	public void setAuctionPrice(Float auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public Long getDealNumber() {
		return dealNumber;
	}

	public void setDealNumber(Long dealNumber) {
		this.dealNumber = dealNumber;
	}

	public Double getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(Double dealAmount) {
		this.dealAmount = dealAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
