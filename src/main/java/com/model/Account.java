package com.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "phone")
	private String phone;
	
    @OneToOne
    @JoinColumn(name = "role_id")
	private Role role;
	
	@OneToMany(mappedBy = "account")
    private Set<Orders> Orders;
	
	
	@OneToMany(mappedBy = "account")
    private Set<Content> Contents;
	
	
	public Account(long id, String name, String mail, String password, String address, String dob, String avatar,
			String phone, Role role, Set<Orders> orders) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.avatar = avatar;
		this.phone = phone;
		this.role = role;
		Orders = orders;
	}
	
	
	
	

}
