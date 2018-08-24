package com.practice1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.practice1.dao.UserDAO;
import com.practice1.model.User;

public class UserDAOImpl implements UserDAO {

	
	public void add(User e) {
		String sql="insert into User values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql, e.getDepartment_id(),e.getRole_id(),e.getUsername(),e.isIs_male(),e.getMobile(),e.getAge(),e.getAddress(),e.isIs_admin(),e.isIs_system(),e.getPassword(),e.getTel(),e.getId_num(),e.getEmail(),e.getHobby(),e.getEducation(),e.getCard_num(),e.getNation(),e.getMarry(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="update User set status=-2 where user_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(User e) {
		String sql="update User set department_id=?,role_id=?,username=?,is_male=?,mobile=?,age=?,address=?,is_admin=?,is_system=?,password=?,tel=?,id_num=?,email=?,hobby=?,education=?,card_num=?,nation=?,marry=?,status=?,remark=?,creater=?,updater=? where user_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getDepartment_id(),e.getRole_id(),e.getUsername(),e.isIs_male(),e.getMobile(),e.getAge(),e.getAddress(),e.isIs_admin(),e.isIs_system(),e.getPassword(),e.getTel(),e.getId_num(),e.getEmail(),e.getHobby(),e.getEducation(),e.getCard_num(),e.getNation(),e.getMarry(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getUser_id());
		
	}

	
	public List<User> selectAll() {
		String sql="select*from User where status=2";
		return JDBCUtil.dbDQLWithSQL(sql, User.class);
		
	}

	
	public User updateByID(int id) {
		String sql="select*from User where User_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, User.class, id).get(0);
	}

	
	public User searchByUsername(String username) {
		String sql="select*from user where username=?";
		List<User> user=JDBCUtil.dbDQLWithSQL(sql, User.class, username);
		if (user.size()!=0) {
			return user.get(0);
		}else {
			return null;  
		}
		
		
	}

	
	public int sum() {
		String sql="select count(User_id) from Department where status=2";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			ResultSet set= pS.executeQuery();
			set.next();
			return set.getInt("count(User_id)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
	public List<User> selectAllByPage(int page, int count) {
		String sql="select *from Department where status=2 limit"+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, User.class);
	}

	
	public User selectByIDname(String name) {
		String sql="select *from Department where status=2 and department_name=?";
		return JDBCUtil.dbDQLWithSQL(sql, User.class, "%"+name+"%").get(0);
	}

	
	public User selectyByIDdesc(String desc) {
		String sql="select *from Department where status=2 and department_desc=?";
		return JDBCUtil.dbDQLWithSQL(sql, User.class, "%"+desc+"%").get(0);
	}

}
