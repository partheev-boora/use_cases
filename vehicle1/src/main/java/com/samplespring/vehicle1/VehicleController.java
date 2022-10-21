package com.samplespring.vehicle1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VehicleController {
	@Autowired
	private BikeRepo br;
	@Autowired
	private CarRepo cr;
	@GetMapping("/bctyres") 
	public List<BikeEntity> getbctyres (){
		return br.getjoin();
	}
	@GetMapping("/cttyres")
	public List<CarEntity> getcttyres(){
		return cr.getjoin2();
	}
	
}