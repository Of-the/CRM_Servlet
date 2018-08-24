package com.practice1.dao;

import java.util.List;

import com.practice1.model.Message;
import com.practice1.model.Notice;

public interface MessageDAO extends BaseDAO<Message>  {
	public Message updateByID(int id);
	public List<Message> selectAll(int id);
	public List<Message> selectByIDname(int id,String name,int page, int count);
	public List<Message> selectyByIDdesc(int id,String desc,int page, int count);
	public int sum(int id,String name);
	public int sun(int id,String name);
	public List<Message> OutboxselectAll(int id);
	public List<Message> OutboxselectAll(int id,int page, int count );
	public int sum(int id);
	public void updateOutboxByID(int id);
	public Message outboxByID(int id);
	public Message showByID(int id);
	public int sun(int id);
	public List<Message> selectAll(int id,int page, int count );
	public List<Message> DraftShowselectAll(int id,int page, int count );
	public int draftSum(int id);
	public List<Message> dustbinSelectAll(int id,int page, int count );
	public int dustbinSum(int id,int idd);
	public void updateDustbinOutboxByID(int id);
	public void deleteDustbinByID(int id);
	public void dustbinByID(int id);
	public void dustbinOutboxByID(int id);
	public Message goUpdateByID(int id);
	public List<Message> dustbinSenderSelectAll(int id);
	public List<Message> dustbinReceiverSelectAll(int id);
	public List<Message> dustbinReceiverSelectAll(int id,int page, int count );
	
}
