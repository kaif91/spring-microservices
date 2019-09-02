package com.currency.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment evt;
	
	@Autowired
	private ExchangeValueRepository repo;
	
	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	 public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		 ExchangeValue value= repo.findByFromAndTo(from, to);
				 // new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
		 value.setPort(Integer.parseInt(evt.getProperty("local.server.port")));
		 logger.info("{}",value);
		 return value;
	}
}
