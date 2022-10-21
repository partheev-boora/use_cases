package com.samplespring.vehicle;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ct2")
public class ResultEntity{
	private String cname;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	private String bname;
	private String tname;
	
}
