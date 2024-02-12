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
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer r_id;
	 private Integer r_stars;
	 @ManyToOne
	 @JoinColumn(name="c_id",referencedColumnName="c_id",nullable=false)
	 private  Customer Customer;
	 @ManyToOne
	 @JoinColumn(name="p_id",referencedColumnName="p_id",nullable=false)
	 private  Product Product ;
	public Integer getR_id() {
		return r_id;
	}
	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}
	public Integer getR_stars() {
		return r_stars;
	}
	public void setR_stars(Integer r_stars) {
		this.r_stars = r_stars;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		Customer = customer;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
	@Override
	public String toString() {
		return "Review [r_id=" + r_id + ", r_stars=" + r_stars + ", Customer=" + Customer + ", Product=" + Product
				+ "]";
	}
	 
}
