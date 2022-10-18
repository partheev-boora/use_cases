package com.KPI.emp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NameController {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/name") 
	public ArrayList<String> getempname(){
		ArrayList<String> enames=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		enames.add(emt.getName());
    	}
    	return enames;
	}
}
