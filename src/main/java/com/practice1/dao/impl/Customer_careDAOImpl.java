package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_careDAO;
import com.practice1.model.Customer_care;
import com.practice1.model.Customer_category;

public class Customer_careDAOImpl implements Customer_careDAO{		
	
	public void add(Customer_care e) {
		String sql="insert into Customer_care values(null,?,?,?,?,?,now(),now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_id(),e.getCare_subject(),e.getCare_type(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
	}

	public void deleteByID(int id) {
		String sql="update Customer_care set Status=-2 where customer_care_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	public void update(Customer_care e) {
		String sql="update Customer_care set customer_id=?,care_subject=?,care_type=?,status=?,remark=?,next_time=now(),creater=?,update_time=now(),updater=? where customer_care_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_id(),e.getCare_subject(),e.getCare_type(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getCustomer_care_id());
		
		
	}

	public List<Customer_care> selectAll() {
		String sql="select*from Customer_care where Status=2";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_care.class);
		
	}

	public int sum() {
		// TODO Auto-generated method stub
				return 0;
	}

	public List<Customer_care> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer_care updateByID(int id) {
		String sql="select*from Customer_care where Customer_care_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_care.class, id).get(0);
	}

	

}
