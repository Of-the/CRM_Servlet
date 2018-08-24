package com.practice1.model;

import java.sql.Timestamp;

public class Message {
	private int message_id;
	private String subject;
	private String content;
	private int sender;		
	private int send_delete;
	private int send_status;
	private Timestamp save_time;
	private Timestamp send_time;
	private Timestamp send_update_time;
	private int receiver;
	private int receive_delete;
	private int receive_status;
	private Timestamp receive_update_time;
	private String username;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMessage_id() {
		return message_id;
	}
	@Override
	public String toString() {
		return "Message [message_id=" + message_id + ", subject=" + subject + ", content=" + content + ", sender="
				+ sender + ", send_delete=" + send_delete + ", send_status=" + send_status + ", save_time=" + save_time
				+ ", send_time=" + send_time + ", send_update_time=" + send_update_time + ", receiver=" + receiver
				+ ", receive_delete=" + receive_delete + ", receive_status=" + receive_status + ", receive_update_time="
				+ receive_update_time + "]";
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getSend_delete() {
		return send_delete;
	}
	public void setSend_delete(int send_delete) {
		this.send_delete = send_delete;
	}
	public int getSend_status() {
		return send_status;
	}
	public void setSend_status(int send_status) {
		this.send_status = send_status;
	}
	public Timestamp getSave_time() {
		return save_time;
	}
	public void setSave_time(Timestamp save_time) {
		this.save_time = save_time;
	}
	public Timestamp getSend_time() {
		return send_time;
	}
	public void setSend_time(Timestamp send_time) {
		this.send_time = send_time;
	}
	public Timestamp getSend_update_time() {
		return send_update_time;
	}
	public void setSend_update_time(Timestamp send_update_time) {
		this.send_update_time = send_update_time;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public int getReceive_delete() {
		return receive_delete;
	}
	public void setReceive_delete(int receive_delete) {
		this.receive_delete = receive_delete;
	}
	public int getReceive_status() {
		return receive_status;
	}
	public void setReceive_status(int receive_status) {
		this.receive_status = receive_status;
	}
	public Timestamp getReceive_update_time() {
		return receive_update_time;
	}
	public void setReceive_update_time(Timestamp receive_update_time) {
		this.receive_update_time = receive_update_time;
	}
	
	
}
