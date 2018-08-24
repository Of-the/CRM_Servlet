package com.practice1.model;

import java.sql.Timestamp;

public class Customer_link {
	private int link_id;
	private int customer_id;
	private String link_name;
	private String link_is_male;
	private String link_position;
	private String link_mobile;
	private int link_age;
	private int link_relation;
	private int status;
	private String remark;
	private Timestamp next_time;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	public int getLink_id() {
		return link_id;
	}
	public void setLink_id(int link_id) {
		this.link_id = link_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getLink_name() {
		return link_name;
	}
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	public String getLink_is_male() {
		return link_is_male;
	}
	public void setLink_is_male(String link_is_male) {
		this.link_is_male = link_is_male;
	}
	public String getLink_position() {
		return link_position;
	}
	public void setLink_position(String link_position) {
		this.link_position = link_position;
	}
	public String getLink_mobile() {
		return link_mobile;
	}
	public void setLink_mobile(String link_mobile) {
		this.link_mobile = link_mobile;
	}
	public int getLink_age() {
		return link_age;
	}
	public void setLink_age(int link_age) {
		this.link_age = link_age;
	}
	public int getLink_relation() {
		return link_relation;
	}
	public void setLink_relation(int link_relation) {
		this.link_relation = link_relation;
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
