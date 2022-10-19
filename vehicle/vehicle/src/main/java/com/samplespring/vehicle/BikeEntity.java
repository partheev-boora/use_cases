package com.samplespring.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class BikeEntity {
	@Id
	private String bid;
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
		return numofbtyres;
	}
	public void setNumofbtyres(Integer numofbtyres) {
		this.numofbtyres = numofbtyres;
	}
	private String bname;
	private Integer numofbtyres;
	
}
