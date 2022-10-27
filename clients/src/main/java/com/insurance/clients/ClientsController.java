package com.insurance.clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClientsController {
	@Autowired
	private ClientsRepo cr;
	final int percent=100;
	int premium=0;
	@GetMapping("/{term}/{payable}") 
	public int getdisc(@PathVariable String term, @PathVariable int payable){
		if(term.equals("greaterthan5"))
			premium=(payable*88)/percent;
		else if(term.equals("equalto5"))
			premium=(payable*90)/percent;
		else
			premium=payable;
		return premium;
	}	
}
