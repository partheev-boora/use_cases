package com.KPI.emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo er;
    @GetMapping("/sample2")
    public List<EmployeeEntity> list() {
    	ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		temp.setId(emt.getId());
    		temp.setName(emt.getName());
    		transformedvalues.add(temp);
    	}
        return transformedvalues;
    }
}
