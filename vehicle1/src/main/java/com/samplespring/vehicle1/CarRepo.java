package com.samplespring.vehicle1;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CarRepo extends JpaRepository<CarEntity, String>{
@Query(value="select * from car inner join truck on car.numoftyres=truck.numoftyres;",nativeQuery=true)
public List<CarEntity> getjoin2();
}
