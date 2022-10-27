package com.kpi.microservice.currencyexchangeexampleservice.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currencyexchangeexampleservice", url="localhost:8000")  

public interface CurrencyExchangeServiceProxy {

}
