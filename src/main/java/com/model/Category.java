package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="category")
public class Category {
	
	@Id
	private int category_id;
	
	@Column
	private String category_name;
	
	
}
