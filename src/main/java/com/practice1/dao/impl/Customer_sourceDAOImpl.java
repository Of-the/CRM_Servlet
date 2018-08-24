package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_sourceDAO;
import com.practice1.model.Customer_link_record;
import com.practice1.model.Customer_source;

public class Customer_sourceDAOImpl implements Customer_sourceDAO{

	
	public void add(Customer_source e) {
		String sql="insert into Customer_source values(null,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_source_name(),e.getCustomer_source_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="delete from Customer_source where customer_source_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer_source e) {
		String sql="update Customer_source set customer_source_name=?,customer_source_desc=?,status=?,remark=?,creater=?,updater=? where customer_source_id=?";
		JDBCUtil.daDMLWithSQL(sql, e.getCustomer_source_name(),e.getCustomer_source_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getCustomer_source_id());
		
	}

	
	public List<Customer_source> selectAll() {
		String sql="select*from Customer_source";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_source.class);
		
	}

	
	public Customer_source updateByID(int id) {
		String sql="select*from Customer_source where customer_source_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_source.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer_source> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
