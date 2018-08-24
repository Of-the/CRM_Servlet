package com.practice1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.practice1.dao.MessageDAO;
import com.practice1.model.Message;
import com.practice1.model.Notice;

public class MessageDAOImpl implements  MessageDAO{
	/**
	 * 添加邮件方法
	 */
	
	public void add(Message e) {
		String sql="insert into message values(null,?,?,?,?,?,now(),now(),now(),?,?,?,now())";
		JDBCUtil.daDMLWithSQL(sql, e.getSubject(),e.getContent(),e.getSender(),e.getSend_delete(),e.getSend_status(),e.getReceiver(),e.getReceive_delete(),e.getReceive_status());
	}
	/**
	 * 收件箱删除方法
	 */
	
	public void deleteByID(int id) {
		String sql="update Message set receive_delete=0 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
		
	}
	/**
	 * 发件箱删除
	 */
	
	public void updateOutboxByID(int id) {
		String sql="update Message set send_delete=0 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
	}
	/**
	 * 草稿箱发件箱删除
	 */
	
	public void updateDustbinOutboxByID(int id) {
		String sql="update Message set send_delete=-2 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
	}
	/**
	 * 草稿箱收件箱删除方法
	 */
	
	public void deleteDustbinByID(int id) {
		String sql="update Message set receive_delete=-2 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
		
	}
	/**
	 * 草稿箱发件箱还原
	 */
	
	public void dustbinOutboxByID(int id) {
		String sql="update Message set send_delete=2 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
	}
	/**
	 * 草稿箱收件箱还原
	 */
	
	public void dustbinByID(int id) {
		String sql="update Message set receive_delete=2 where message_id=? ";
		JDBCUtil.daDMLWithSQL(sql,id);
		
	}
	
	/**
	 * 修改提取后的，邮件方法
	 */
	
	public void update(Message e) {
		String sql="update Message set subject=?,content=?,sender=?,send_delete=?,send_status=?,save_time=now(),send_update_time=now(),receiver=?,receive_delete=?,receive_status=?,receive_update_time=now() where message_id=?";
		JDBCUtil.daDMLWithSQL(sql, e.getSubject(),e.getContent(),e.getSend_delete(),e.getSend_status(),e.getReceiver(),e.getReceive_delete(),e.getReceive_status(),e.getSender(),e.getMessage_id());
		
	}
	/**
	 * 查找所有邮件方法，以放弃
	 */
	
	public List<Message> selectAll() {
		String sql="select*from message";
		return JDBCUtil.dbDQLWithSQL(sql, Message.class);
		
	}
	/**
	 * 展示垃圾箱,显示发件人姓名的方法
	 */
	public List<Message> dustbinSenderSelectAll(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and send_delete=0 and sender=?";
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示垃圾箱,显示收件人姓名的方法
	 */
	public List<Message> dustbinReceiverSelectAll(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receive_delete=0 and receiver=?";
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示垃圾箱,显示发件人姓名的方法,带分页
	 */	
	public List<Message> dustbinSelectAll(int id,int page, int count ) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and send_delete=0 and sender=? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	
	/**
	 * 展示垃圾箱,显示收件人姓名的方法,带分页
	 */	
	public List<Message> dustbinReceiverSelectAll(int id,int page, int count ) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receive_delete=0 and receiver=? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	
	/**
	 * 展示收件箱的方法
	 */
	public List<Message> selectAll(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receive_delete=2 and receiver=?";
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示收件箱的方法,带分页
	 */	
	public List<Message> selectAll(int id,int page, int count ) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receive_delete=2 and receive_status=2 and receiver=? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示发件箱的方法
	 */	
	public List<Message> OutboxselectAll(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and send_delete=2 and send_status=2 and sender=?";
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示发件箱的方法,带分页
	 */	
	public List<Message> OutboxselectAll(int id,int page, int count ) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and send_delete=2 and send_status=2 and sender=? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 展示草稿箱的方法,带分页
	 */
	public List<Message> DraftShowselectAll(int id,int page, int count ) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and send_delete=2 and send_status=0 and sender=? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class,id);
		
	}
	/**
	 * 提取需要修改的收件箱的，邮件的方法
	 */
	
	public Message updateByID(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and message_id=?";
		List<Message> messages=JDBCUtil.dbDQLWithSQL(sql, Message.class, id);
		return messages.get(0);
	}
	/**
	 * 提取需要修改的发件箱的，邮件的方法
	 */
	
	public Message goUpdateByID(int id) {
		String sql="select m.*,u.username from message m,`user` u where m.receiver=u.user_id and message_id=?";
		List<Message> messages=JDBCUtil.dbDQLWithSQL(sql, Message.class, id);
		return messages.get(0);
	}
	/**
	 * 单独展示
	 */
	public Message outboxByID(int id) {
		String sql="select*from message where message_id=?";
		List<Message> messages=JDBCUtil.dbDQLWithSQL(sql, Message.class, id);
		return messages.get(0);
	}
	/**
	 * 发件箱单独展示
	 */
	public Message showByID(int id) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.receiver=u.user_id and message_id=?";
		List<Message> messages=JDBCUtil.dbDQLWithSQL(sql, Message.class, id);
		return messages.get(0);
	}
	/**
	 * 展示发件箱求和
	 */
	
	public int sum(int id) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.receiver=u.user_id and send_delete=2 and send_status=2 and sender=?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 展示垃圾箱求和
	 */
	
	public int dustbinSum(int id,int idd) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.sender=u.user_id and (receive_delete=0 or send_delete=0) and (sender=? or receiver=?)";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			pS.setInt(2, idd);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 展示草稿箱求和
	 */
	
	public int draftSum(int id) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.receiver=u.user_id and send_delete=2 and send_status=0 and sender=?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 收件箱求和
	 */
	public int sun(int id) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.sender=u.user_id and receive_delete=2 and receive_status=2 and receiver=?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 未完成方法
	 */
	
	public List<Message> selectAllByPage(int page, int count) {
		String sql="select *from Message where receiver=2 limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class);
	}
	/**
	 * 收件箱标题分页模糊查询
	 */
	
	public List<Message> selectByIDname(int id,String name, int page, int count) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receiver=? and subject like ? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class, id,"%"+name+"%");
	}
	/**
	 * 收件箱内容分页模糊查询
	 */
	
	public List<Message> selectyByIDdesc(int id,String desc, int page, int count) {
		String sql="select m.*,u.username from message m,`user` u where m.sender=u.user_id and receiver=? and content like ? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Message.class, id,"%"+desc+"%");
	}
	/**
	 * 收件箱内容分页模糊查询总数
	 */
	
	public int sum(int id,String name) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.receiver=u.user_id and receive_delete=2 and receiver=? and content like ?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			pS.setString(2, "%"+name+"%");
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	
	}
	/**
	 * 收件箱标题分页模糊查询总数
	 */
	
	public int sun(int id,String name) {
		String sql="select m.*,u.username,count(message_id) from message m,`user` u where m.receiver=u.user_id and receive_delete=2 and receiver=? and subject like ?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setInt(1, id);
			pS.setString(2, "%"+name+"%");
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(message_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}


}
