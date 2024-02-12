package com.blueyonder.team4.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer p_id;
	 private String details;
	 private String thumbnail;
	 private String name;

	 private Integer qty;

	 private double price;
	 @ManyToOne
	 @JoinColumn(name="cat_id",referencedColumnName="category_id",nullable=false)
	 private Category Category;
	public Integer getP_id() {
		return p_id;
	}
	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", details=" + details + ", thumbnail=" + thumbnail + ", name=" + name
				+ ", qty=" + qty + ", price=" + price + ", Category=" + Category + "]";
	}
	
	 
}
