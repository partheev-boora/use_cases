package com.samplespring.vehicle1;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface BikeRepo extends JpaRepository<BikeEntity, String>{
	@Query(value = "select * from truck t join  car c on t.numoftyres = c.numoftyres  join bike b on c.numoftyres = b.numoftyres group by b.bid order by b.bid",nativeQuery = true)
	public List<BikeEntity> getjoin();
}