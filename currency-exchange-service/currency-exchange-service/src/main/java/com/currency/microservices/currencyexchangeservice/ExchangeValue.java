package com.currency.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Id
	private Long id;
	private BigDecimal conversionMultiple;
	private int port;
	
	
	public ExchangeValue() {}
	
	public ExchangeValue(Long id,String from, String to, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}

	
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	
	
	
	

}
