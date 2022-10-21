package com.insurance.clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClientsController {
	@Autowired
	//private ClientsRepo cr;//up to date
	@GetMapping("/client_discount/{term}/{payable}") 
	public int getdisc(@PathVariable String term, @PathVariable int payable){
		int premium=0;
		if(term=="greaterthan5")
			premium=(payable*12)/100;
		else if(term=="equalto5")
			premium=(payable*10)/100;
		else
			premium=payable;
		return premium;
	}	
}
