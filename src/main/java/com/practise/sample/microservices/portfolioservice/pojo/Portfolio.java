package com.practise.sample.microservices.portfolioservice.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue
	private long id;	
	
	private String stockName;
	private float stockValue;
	private int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	public float getStockValue() {
		return stockValue;
	}
	public void setStockValue(float stockValue) {
		this.stockValue = stockValue;
	}
	
	
	public Portfolio(long id, String stockName, float stockValue, int port) {
		super();
		this.id = id;
		this.stockName = stockName;
		this.stockValue = stockValue;
		this.port = port;
	}
	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", stockName=" + stockName + ", stockValue=" + stockValue + ", port=" + port
				+ "]";
	}
	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
