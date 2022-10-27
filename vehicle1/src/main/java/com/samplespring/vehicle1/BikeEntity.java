package com.samplespring.vehicle1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class BikeEntity {
	@Id
	private String bid;
	private String bname;
	private Integer numoftyres;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getNumofbtyres() {
		return numoftyres;
	}
	public void setNumofbtyres(Integer numofbtyres) {
		this.numoftyres = numofbtyres;
	}
	
}
