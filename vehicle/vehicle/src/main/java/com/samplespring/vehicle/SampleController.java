package com.samplespring.vehicle;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	@Autowired
	private CarRepo cr;
	private BikeRepo br;
	private TruckRepo tr;
	
	@GetMapping("/numoftyres") 
	public List<String> getSample(){
		ArrayList<String> vnames=new ArrayList<String>();
    	for(BikeEntity emt:br.findAll())
    		vnames.add(emt.getBname());
    	for(CarEntity emt:cr.findAll())
    		vnames.add(emt.getCname());
    	for(TruckEntity emt:tr.findAll())
    		vnames.add(emt.getTname());
    	return vnames;
	}

}