package com.desafio.devweek.santander2023.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_accont")
public class Accont {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//esse numero é unico
	@Column(unique = true)
	private String number;
	private String agency;
	
	// 13 numeros inteiros e 2 decimais
	@Column(scale = 13, precision = 2)
	private BigDecimal balance;
	
	@Column(name="additional_limit" ,scale = 13, precision = 2)
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
