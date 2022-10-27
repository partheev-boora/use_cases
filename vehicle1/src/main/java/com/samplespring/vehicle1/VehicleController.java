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
	@Autowired
	private TruckRepo tr;
	@GetMapping("/b") 
	public List<BikeEntity> getbtyres (){
		return br.getjoin();
	}
	@GetMapping("/c")
	public List<CarEntity> getctyres(){
		return cr.getjoin();
	}
	@GetMapping("/t")
	public List<TruckEntity> getttyres(){
		return tr.getjoin();
	}
}