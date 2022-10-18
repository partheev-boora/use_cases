package com.KPI.emp;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DeptController {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/dept") 
	public ArrayList<String> getempname(){
		ArrayList<String> edept=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		edept.add(emt.getDept());
    	}
    	return edept;
	}
}
