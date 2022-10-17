package com.KPI.emp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SchoolController {
	@Autowired
	private SchoolRepo rv;
	@GetMapping("/school") 
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity emt:rv.findAll()) {
    	    SchoolEntity temp=new SchoolEntity();
    		temp.setId(emt.getId());
    		temp.setName(emt.getName());
    		transformedvalues.add(temp);
    	}
    	ArrayList<SchoolEntity> first=new ArrayList<SchoolEntity>();
    	first.add(transformedvalues.get(0));
    	return first;  
	}
}
