package com.samplespring.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
public class TruckEntity {
	@Id
	private String tid;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getNumoftyres() {
		return numoftyres;
	}
	public void setNumoftyres(Integer numoftyres) {
		this.numoftyres = numoftyres;
	}
	private String tname;
	private Integer numoftyres;
	
}
