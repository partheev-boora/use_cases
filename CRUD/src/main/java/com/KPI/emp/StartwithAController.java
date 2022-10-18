package com.KPI.emp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StartwithAController {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/A") 
	public ArrayList<String> getempname(){
		ArrayList<String> eid=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		if(emt.getName().startsWith("a"))
    		eid.add(emt.getName());
    	}
    	return eid;
	}
}
