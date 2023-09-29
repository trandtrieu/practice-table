package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int name;
	@Column
	private int price;
	@Column
	private String brand;
	@Column
	private int status;
	
	
	@OnetoOne(mappedBy="product")
	private Product_detail detail;
	

}
