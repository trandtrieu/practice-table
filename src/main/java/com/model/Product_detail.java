package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="product_detail")
public class Product_detail {
	@Id
	private int id;

	@Column
	private String desc_component;
	
	@Column
	private String desc_vitue;
	
	@Column
	private String desc_detail;
}
