package com.practice1.model;
import java.sql.Timestamp;

public class Customer_state {
	private int customer_state_id;
	private String customer_state_name;
	private String customer_state_desc;
	private int status;
	private String remark;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	public int getCustomer_state_id() {
		return customer_state_id;
	}
	public void setCustomer_state_id(int customer_state_id) {
		this.customer_state_id = customer_state_id;
	}
	public String getCustomer_state_name() {
		return customer_state_name;
	}
	public void setCustomer_state_name(String customer_state_name) {
		this.customer_state_name = customer_state_name;
	}
	public String getCustomer_state_desc() {
		return customer_state_desc;
	}
	public void setCustomer_state_desc(String customer_state_desc) {
		this.customer_state_desc = customer_state_desc;
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
