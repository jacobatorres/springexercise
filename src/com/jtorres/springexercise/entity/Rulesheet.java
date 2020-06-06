package com.jtorres.springexercise.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="rulesheet")
public class Rulesheet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@NotNull
	@Size(min=1, message="type name not be blank")
	@Column(name="type")
	private String type;
	

	@Column(name = "customer_id")
	private int customerId;
	

	
	@NotNull
	@Size(min=1, message="file content not be blank")
	@Column(name = "filecontent")
	private String filecontent;
	


	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	
	public  Rulesheet() {
		
	}


	public Rulesheet(String type, String filecontent) {
		this.type = type;
		this.filecontent = filecontent;
	}
	
	public int getcustomerId() {
		return customerId;
	}


	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getFilecontent() {
		return filecontent;
	}

	public void setFilecontent(String filecontent) {
		this.filecontent = filecontent;
	}
	
	

	
}
