package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_stateDAO;
import com.practice1.model.Customer_link_record;
import com.practice1.model.Customer_state;

public class Customer_stateDAOImpl implements Customer_stateDAO{

	
	public void add(Customer_state e) {
		String sql="insert into Customer_state values(null,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_state_name(),e.getCustomer_state_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="delete from Customer_state where customer_state_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer_state e) {
		String sql="update Customer_state set customer_state_name=?,customer_state_desc=?,status=?,remark=?,creater=?,updater=? where customer_state_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_state_name(),e.getCustomer_state_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getCustomer_state_id());
		
		
	}

	
	public List<Customer_state> selectAll() {
		String sql="select*from Customer_state";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_state.class);
	}

	
	public Customer_state updateByID(int id) {
		String sql="select*from Customer_state where customer_state_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_state.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer_state> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
