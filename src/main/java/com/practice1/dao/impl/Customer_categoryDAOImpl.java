package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_categoryDAO;
import com.practice1.model.Customer_category;

public class Customer_categoryDAOImpl implements Customer_categoryDAO {

	
	public void add(Customer_category e) {
		String sql="insert into Customer_category values(null,?,?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_category_name(),e.getCustomer_category_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
	}

	
	public void deleteByID(int id) {
		String sql="update Customer_category set status=-2 where customer_category_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer_category e) {
		String sql="update Customer_category set customer_category_name=?,customer_category_desc=?,status=?,remark=?,creater=?,updater=? where customer_category_id=? ";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_category_name(),e.getCustomer_category_desc(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getCustomer_category_id());
		
	}

	
	public List<Customer_category> selectAll() {
		String sql="select*from Customer_category where status=2";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_category.class);
		
	}

	
	public Customer_category updateByID(int id) {
		String sql="select*from Customer_category where customer_category_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_category.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer_category> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
