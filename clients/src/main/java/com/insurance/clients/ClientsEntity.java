package com.insurance.clients;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class ClientsEntity {
	@Id
	private Integer cid;
	private String cname;
	private Integer term;
	private Integer payable;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getTerm() {
		return term;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Integer getPayable() {
		return payable;
	}
	public void setPayable(Integer payable) {
		this.payable = payable;
	}
	
}
