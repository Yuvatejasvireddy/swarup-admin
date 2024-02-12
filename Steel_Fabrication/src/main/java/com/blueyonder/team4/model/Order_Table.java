package com.blueyonder.team4.model;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Order_Table {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer o_id;
    private Integer[] p_id;
    private Integer[] p_qty;
    @Temporal(TemporalType.DATE)
	 private Date o_date ;
    @Temporal(TemporalType.DATE)
    private Date o_delivery;
    private String payment_mode;
    public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	private String status;
    @ManyToOne
	 @JoinColumn(name="staff_id",referencedColumnName="staff_id",nullable=false)
	 private Staff Staff;
    
    
	public Integer getO_id() {
		return o_id;
	}
	public void setO_id(Integer o_id) {
		this.o_id = o_id;
	}
	public Integer[] getP_id() {
		return p_id;
	}
	public void setP_id(Integer[] p_id) {
		this.p_id = p_id;
	}
	public Integer[] getP_qty() {
		return p_qty;
	}
	public void setP_qty(Integer[] p_qty) {
		this.p_qty = p_qty;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public Date getO_delivery() {
		return o_delivery;
	}
	public void setO_delivery(Date o_delivery) {
		this.o_delivery = o_delivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Staff getStaff() {
		return Staff;
	}
	public void setStaff(Staff staff) {
		Staff = staff;
	}
	@Override
	public String toString() {
		return "Order_Table [o_id=" + o_id + ", p_id=" + Arrays.toString(p_id) + ", p_qty=" + Arrays.toString(p_qty)
				+ ", o_date=" + o_date + ", o_delivery=" + o_delivery + ", payment_mode=" + payment_mode + ", status="
				+ status + ", Staff=" + Staff + "]";
	}

    
}
