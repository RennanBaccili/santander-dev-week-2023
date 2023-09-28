package com.desafio.devweek.santander2023.model;

import java.math.BigDecimal;

public class Accont {

	private Long id;
	private String number;
	private String agency;
	private BigDecimal balance;
	private BigDecimal limit;
	public String getBigDecimal() {
		return number;
	}
	public void setBigDecimal(String number) {
		this.number = number;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
