package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.Customer_link_recordDAO;
import com.practice1.model.Customer_category;
import com.practice1.model.Customer_link_record;

public class Customer_link_recordDAOImpl implements Customer_link_recordDAO{

	
	public void add(Customer_link_record e) {
		String sql="insert into Customer_link_record values(null,?,?,?,?,?,?,now(),now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_id(),e.getLink_type(),e.getLink_subject(),e.getLink_nexttime(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
	}

	
	public void deleteByID(int id) {
		String sql="delete from Customer_link_record where record_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer_link_record e) {
		String sql="update Customer_link_record set customer_id=?,link_type=?,link_subject=?,link_nexttime=?,status=?,remark=?,creater=?,updater=? where record_id=?";
		JDBCUtil.daDMLWithSQL(sql, e.getCustomer_id(),e.getLink_type(),e.getLink_subject(),e.getLink_nexttime(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getRecord_id());
		
	}

	
	public List<Customer_link_record> selectAll() {
		String sql="select*from Customer_link_record";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_link_record.class);
		
	}

	
	public Customer_link_record updateByID(int id) {
		String sql="select*from Customer_category where record_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer_link_record.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer_link_record> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
