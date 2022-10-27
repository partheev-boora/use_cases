package com.insurance.clients;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientsRepo extends JpaRepository<ClientsEntity,Integer>{
	@Query(value = "select * from client where cid =1",nativeQuery=true)
	List<ClientsEntity> finddetails1();
	@Query(value = "select * from client where cid =2",nativeQuery=true)
	List<ClientsEntity> finddetails2();
	@Query(value = "select * from client where term =5",nativeQuery=true)
	List<ClientsEntity> findterm5();
	@Query(value = "select * from client where term > 5",nativeQuery=true)
	List<ClientsEntity> findtermmorethan5();
	@Query(value = "select * from client where term < 5",nativeQuery=true)
	List<ClientsEntity> findtermlessthan5();
}
