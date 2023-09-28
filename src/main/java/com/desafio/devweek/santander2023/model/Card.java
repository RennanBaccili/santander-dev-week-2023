package com.desafio.devweek.santander2023.model;

import java.math.BigDecimal;

public class Card {
	
	private Long id;
	String number;
	BigDecimal limit;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
