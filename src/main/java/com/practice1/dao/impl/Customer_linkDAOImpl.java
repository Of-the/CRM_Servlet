package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_linkDAO;
import com.practice1.model.Customer_link;
import com.practice1.model.Customer_link_record;

public class Customer_linkDAOImpl implements Customer_linkDAO{

	
	public void add(Customer_link e) {
		String sql="insert into Customer_link values(null,?,?,?,?,?,?,?,?,?,now(),now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_id(),e.getLink_name(),e.getLink_is_male(),e.getLink_position(),e.getLink_mobile(),e.getLink_age(),e.getLink_relation(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="delete from Customer_link where link_id=? ";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer_link e) {
		String sql="update Customer_link set customer_id=?,link_name=?,link_is_male=?,link_position=?,link_mobile=?,link_age=?,link_relation=?,status=?,remark=?,creater=?,updater=? where link_id=?";
		JDBCUtil.daDMLWithSQL(sql, e.getCustomer_id(),e.getLink_name(),e.getLink_is_male(),e.getLink_position(),e.getLink_mobile(),e.getLink_age(),e.getLink_relation(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getLink_id());
		
	}

	
	public List<Customer_link> selectAll() {
		String sql="select*from Customer_link";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_link.class);
		
	}

	
	public Customer_link updateByID(int id) {
		String sql="select*from Customer_link where link_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_link.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer_link> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
