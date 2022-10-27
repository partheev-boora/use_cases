package com.samplespring.vehicle1;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
public class TruckEntity {
	@Id
	private String truckid;
	private String truckname;
	private Integer numoftyres;
	public String getTid() {
		return truckid;
	}
	public void setTid(String tid) {
		this.truckid = tid;
	}
	public String getTname() {
		return truckname;
	}
	public void setTname(String tname) {
		this.truckname = tname;
	}
	public Integer getNumoftyres() {
		return numoftyres;
	}
	public void setNumoftyres(Integer numoftyres) {
		this.numoftyres = numoftyres;
	}
}
