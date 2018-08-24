package com.practice1.model;

import java.sql.Timestamp;

public class Customer_category {
	private int customer_category_id;
	private String customer_category_name;
	private String customer_category_desc;
	private int status;
	private String remark;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	public int getCustomer_category_id() {
		return customer_category_id;
	}
	public void setCustomer_category_id(int customer_category_id) {
		this.customer_category_id = customer_category_id;
	}
	public String getCustomer_category_name() {
		return customer_category_name;
	}
	public void setCustomer_category_name(String customer_category_name) {
		this.customer_category_name = customer_category_name;
	}
	public String getCustomer_category_desc() {
		return customer_category_desc;
	}
	public void setCustomer_category_desc(String customer_category_desc) {
		this.customer_category_desc = customer_category_desc;
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
