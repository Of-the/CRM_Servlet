package com.practice1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.practice1.dao.RoleDAO;
import com.practice1.model.Customer;
import com.practice1.model.Department;
import com.practice1.model.Role;

public class RoleDAOImpl implements RoleDAO {

	
	public void add(Role e) {
		String sql="insert into Role values(null,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getRole_name(),e.getRole_permission(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="update Role set status=-2 where role_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Role e) {
		String sql="update Role set role_name=?,role_permission=?,status=?,remark=?,creater=?,updater=? where Role_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getRole_name(),e.getRole_permission(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getRole_id());
		
	}

	
	public List<Role> selectAll() {
		String sql="select*from Role where status=2";
		return JDBCUtil.dbDQLWithSQL(sql, Role.class);
		
	}

	
	public Role updateByID(int id) {
		String sql="select*from Role where Role_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Role.class, id).get(0);
	}

	
	public int sum() {
		String sql="select count(role_id) from Role where status=2";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			ResultSet set= pS.executeQuery();
			set.next();
			int count= set.getInt("count(role_id)");
			
			set.close();
			pS.close();
			connection.close();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	
	public List<Role> selectAllByPage(int page, int count) {
		String sql="select *from Role where status=2 LIMIT "+page+","+ count;
		return JDBCUtil.dbDQLWithSQL(sql, Role.class);
	}

	
	public Role selectByIDname(String name) {
		String sql="select *from Department where status=2 and department_name=?";
		return JDBCUtil.dbDQLWithSQL(sql, Role.class, "%"+name+"%").get(0);
	}

	
	public Role selectyByIDdesc(String desc) {
		String sql="select *from Department where status=2 and department_desc=?";
		return JDBCUtil.dbDQLWithSQL(sql, Role.class, "%"+desc+"%").get(0);
	}

}
