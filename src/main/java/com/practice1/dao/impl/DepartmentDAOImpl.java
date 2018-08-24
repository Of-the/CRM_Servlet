package com.practice1.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.practice1.dao.DepartmentDAO;
import com.practice1.model.Customer;
import com.practice1.model.Department;

public class DepartmentDAOImpl implements DepartmentDAO{

	
	public void add(Department e) {
		String sql="insert into Department values(null,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getDepartment_name(),e.getDepartment_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="update Department set status=-2 where department_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Department e) {
		String sql="update Department set department_name=?,department_desc=?,status=?,remark=?,creater=?,updater=? where department_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getDepartment_name(),e.getDepartment_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getDepartment_id());
		
	}

	
	public List<Department> selectAll() {
		String sql="select*from Department where status=2";
		return JDBCUtil.dbDQLWithSQL(sql,Department.class);
		
	}

	
	public Department updateByID(int id) {
		String sql="select*from Department where Department_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Department.class, id).get(0);
	}

	
	public int sum() {
		String sql="select count(Department_id) from Department where status=2";
		Connection connection=JDBCUtil.getConnection();
		try {
			PreparedStatement pS=connection.prepareStatement(sql);
			ResultSet set= pS.executeQuery();
			set.next();
			int con=set.getInt("count(Department_id)");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}


	
	public List<Department> selectAllByPage(int page, int count) {
		String sql="select *from Department where status=2 limit "+page+","+count;
		return JDBCUtil.dbDQLWithSQL(sql, Department.class);
	}

	
	public List<Department> selectByIDname(String name) {
		String sql="select *from Department where status=2 and department_name like ?";
		return JDBCUtil.dbDQLWithSQL(sql, Department.class, "%"+name+"%");
	}

	
	public List<Department> selectyByIDdesc(String desc) {
		String sql="select *from Department where status=2 and department_desc like ?";
		return JDBCUtil.dbDQLWithSQL(sql, Department.class, "%"+desc+"%");
	}

}
