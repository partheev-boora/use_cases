package com.kpi.microservice.currencyexchangeexampleservice.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConvertCurrencyFeign {
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)  
	{  
		Map<String, String>uriVariables=new HashMap<>();  
		uriVariables.put("from", from);  
		uriVariables.put("to", to);  
		ResponseEntity<CurrencyConversionSampleBean>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean.class, uriVariables);
		CurrencyConversionSampleBean response=responseEntity.getBody();  
		return new CurrencyConversionSampleBean(1L, from,to,BigDecimal.ONE, quantity,quantity,0 );  
	} 
	
}
