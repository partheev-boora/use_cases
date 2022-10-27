package com.samplespring.vehicle1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity, String>{
	@Query(value = "select * from truck t  join  car c on t.numoftyres= c.numoftyres  join bike b on c.numoftyres = b.numoftyres group by t.truckid order by t.truckid",nativeQuery = true)
	public List<TruckEntity> getjoin();
}
