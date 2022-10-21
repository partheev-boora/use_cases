package com.samplespring.vehicle;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	@Autowired
	private ResultRepo rr;
	
	@GetMapping("/numoftyres") 
	public List<ResultEntity> getSample(){
		ArrayList<ResultEntity> transformedvalues=new ArrayList<ResultEntity>();
    	for(ResultEntity emt:rr.findAll()) {
    		ResultEntity temp=new ResultEntity();
    		temp.setCname(emt.getCname());
    		temp.setBname(emt.getBname());
    		temp.setTname(emt.getTname());
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}

}