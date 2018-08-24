package com.practice1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.practice1.dao.NoticeDAO;
import com.practice1.model.Customer;
import com.practice1.model.Department;
import com.practice1.model.Notice;

public class NoticeDAOImpl implements NoticeDAO{

	
	public void add(Notice e) {
		String sql="insert into Notice values(null,?,?,?,?,?,2,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getReceive_id(),e.getSubject(),e.getText(),e.getPub_time(),e.getExpire_time(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="update Notice set status=-2 where notice_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Notice e) {
		String sql="update Notice set Pub_time=?,Expire_time=?,receive_id=?,subject=?,text=?,status=?,remark=?,creater=?,updater=? where notice_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getPub_time(),e.getExpire_time(),e.getReceive_id(),e.getSubject(),e.getText(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getNotice_id());
		
	}

	
	public List<Notice> selectAll() {
		String sql="select*from Notice where status=2";
		return JDBCUtil.dbDQLWithSQL(sql,Notice.class);
		
	}

	
	public Notice updateByID(int id) {
		String sql="select*from Notice where Notice_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Notice.class, id).get(0);
	}

	
	public int sum() {
		String sql="select count(Notice_id) from Notice where status=2";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(Notice_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int sum(String name) {
		String sql="select count(Notice_id) from Notice where status=2 and subject like ?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setString(1, name);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(Notice_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


	
	public List<Notice> selectAllByPage(int page, int count) {
		String sql="select *from Notice where status=2 limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Notice.class);
	}
	
	public List<Notice> selectByIDname(String name,int page, int count) {
		String sql="select *from Notice where status=2 and subject like ? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Notice.class, "%"+name+"%");
	}

	
	public List<Notice> selectyByIDdesc(String desc,int page, int count) {
		String sql="select *from Notice where status=2 and text like ? limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Notice.class, "%"+desc+"%");
	}

	
	public int sun(String name) {
		String sql="select count(Notice_id) from Notice where status=2 and text like ?";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			pS.setString(1, name);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(Notice_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
