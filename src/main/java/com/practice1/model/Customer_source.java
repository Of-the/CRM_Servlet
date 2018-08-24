package com.practice1.model;
import java.sql.Timestamp;

public class Customer_source {
	private int customer_source_id;
	private String customer_source_name;
	private String customer_source_desc;
	private int status;
	private String remark;
	private Timestamp create_time;
	private int creater;
	private Timestamp  update_time;
	private int updater;
	public int getCustomer_source_id() {
		return customer_source_id;
	}
	public void setCustomer_source_id(int customer_source_id) {
		this.customer_source_id = customer_source_id;
	}
	public String getCustomer_source_name() {
		return customer_source_name;
	}
	public void setCustomer_source_name(String customer_source_name) {
		this.customer_source_name = customer_source_name;
	}
	public String getCustomer_source_desc() {
		return customer_source_desc;
	}
	public void setCustomer_source_desc(String customer_source_desc) {
		this.customer_source_desc = customer_source_desc;
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
