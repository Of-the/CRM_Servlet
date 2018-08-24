package com.practice1.model;

import java.sql.Timestamp;

public class Customer_care {
	private int customer_care_id;
	private int customer_id;
	private String care_subject;
	private String care_type;
	private int status;
	private String remark;
	private Timestamp next_time;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	@Override
	public String toString() {
		return "Customer_care [customer_care_id=" + customer_care_id + ", customer_id=" + customer_id
				+ ", care_subject=" + care_subject + ", care_type=" + care_type + ", status=" + status + ", remark="
				+ remark + ", next_time=" + next_time + ", create_time=" + create_time + ", creater=" + creater
				+ ", update_time=" + update_time + ", updater=" + updater + "]";
	}
	public int getCustomer_care_id() {
		return customer_care_id;
	}
	public void setCustomer_care_id(int customer_care_id) {
		this.customer_care_id = customer_care_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCare_subject() {
		return care_subject;
	}
	public void setCare_subject(String care_subject) {
		this.care_subject = care_subject;
	}
	public String getCare_type() {
		return care_type;
	}
	public void setCare_type(String care_type) {
		this.care_type = care_type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getNext_time() {
		return next_time;
	}
	public void setNext_time(Timestamp next_time) {
		this.next_time = next_time;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getCreater() {
		return creater;
	}
	public void setCreater(int creater) {
		this.creater = creater;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public int getUpdater() {
		return updater;
	}
	public void setUpdater(int updater) {
		this.updater = updater;
	}
	
	
	
}
