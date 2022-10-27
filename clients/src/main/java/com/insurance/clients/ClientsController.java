package com.insurance.clients;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClientsController {
	@Autowired
	private ClientsRepo cr;
	@GetMapping("/details/c1")
	public List<ClientsEntity> getdetails(){
		return cr.finddetails1();
		
	}
	@GetMapping("/details/c2")
	public List<ClientsEntity> getdetails2(){
		return cr.finddetails2();
		
	}
	@GetMapping("/details/{id}")
	public Optional<ClientsEntity> getdetails3(@PathVariable(value = "id") int id){
		return cr.findById(id);
		
	}
	
	@GetMapping("/details/c4")
	public Optional<ClientsEntity> getdetails4(){
		return cr.findById(4);
		
	}
	
	@GetMapping("/details/c5")
	public Optional<ClientsEntity> getdetails5(){
		return cr.findById(5);
		
	}
	@GetMapping("/equalto5")
	public List<ClientsEntity> equalto(){
		return cr.findterm5();
		
	}
	@GetMapping("/lessthan5")
	public List<ClientsEntity> lessthan(){
		return cr.findtermlessthan5();
		
	}
	@GetMapping("/greaterthan5")
	public List<ClientsEntity> greaterthan(){
		return cr.findtermmorethan5();
		
	}
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
