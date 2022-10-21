package com.samplespring.vehicle1;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface BikeRepo extends JpaRepository<BikeEntity, String>{
	@Query(value="SELECT * from car INNER JOIN truck ON bike.numoftyres=car.numoftyres;",nativeQuery=true)
	public List<BikeEntity> getjoin();
}