package com.practice1.model;
import java.sql.Timestamp;

public class Customer_link_record {
	private int record_id;
	private int customer_id;
	private String link_type;
	private String link_subject;
	private String link_nexttime;
	private int status;
	private String remark;
	private Timestamp next_time;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getLink_type() {
		return link_type;
	}
	public void setLink_type(String link_type) {
		this.link_type = link_type;
	}
	public String getLink_subject() {
		return link_subject;
	}
	public void setLink_subject(String link_subject) {
		this.link_subject = link_subject;
	}
	public String getLink_nexttime() {
		return link_nexttime;
	}
	public void setLink_nexttime(String link_nexttime) {
		this.link_nexttime = link_nexttime;
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
