package com.example.JavaMachineTest.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer catId;
	@Column(name="electronics")
	private String catName;
	@JsonIgnore
	@OneToMany(mappedBy = "prodCategory")
	private List<Product> products;
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Category(Integer catId, String catName, List<Product> products) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.products = products;
	}
	public Category() {
		super();
	}
	
		
	

	
}
