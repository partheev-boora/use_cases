package com.samplespring.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class CarEntity {
	@Id
	private String cid;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getNumofctyres() {
		return numofctyres;
	}
	public void setNumofctyres(Integer numofctyres) {
		this.numofctyres = numofctyres;
	}
	private String cname;
	private Integer numofctyres;
	
	
}
