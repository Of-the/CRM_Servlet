package com.practice1.dao.impl;

import java.util.List;

import com.practice1.dao.CustomerDAO;
import com.practice1.model.Customer;
import com.practice1.model.Customer_link_record;

public class CustomerDAOImpl implements CustomerDAO {

	
	public void add(Customer e) {
		String sql="insert into Customer values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now(),?,?,?,now(),?,now(),?)";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_state_id(),e.getCustomer_source_id(),e.getUser_id(),e.getCustomer_category_id(),e.getCustomer_name(),e.isCustomer_is_male(),e.getCustomer_mobile(),e.getCustomer_qq(),e.getCustomer_address(),e.getCustomer_email(),e.getCustomer_remark(),e.getCustomer_position(),e.getCustomer_blog(),e.getCustomer_tel(),e.getCustomer_company(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
	}

	
	public void deleteByID(int id) {
		String sql="update Customer set status=-2 where customer_id=?";
		JDBCUtil.daDMLWithSQL(sql, id);
		
	}

	
	public void update(Customer e) {
		String sql="update Customer set customer_state_id=?,customer_source_id=?,user_id=?,customer_category_id=?,customer_name=?,customer_is_male=?,customer_mobile=?,customer_qq=?,customer_address=?,customer_email=?,customer_remark=?,customer_position=?,customer_blog=?,customer_tel=?,customer_company=?,status=?,remark=?,creater=?,updater=? where customer_id=?";
		JDBCUtil.daDMLWithSQL(sql,e.getCustomer_state_id(),e.getCustomer_source_id(),e.getUser_id(),e.getCustomer_category_id(),e.getCustomer_name(),e.isCustomer_is_male(),e.getCustomer_mobile(),e.getCustomer_qq(),e.getCustomer_address(),e.getCustomer_email(),e.getCustomer_remark(),e.getCustomer_position(),e.getCustomer_blog(),e.getCustomer_tel(),e.getCustomer_company(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getCustomer_id());
		
	}

	
	public List<Customer> selectAll() {
		String sql="select*from Customer where status=2";
		return JDBCUtil.dbDQLWithSQL(sql,Customer.class);
		
	}

	
	public Customer updateByID(int id) {
		String sql="select*from Customer where customer_id=?";
		return JDBCUtil.dbDQLWithSQL(sql, Customer.class, id).get(0);
	}

	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer> selectAllByPage(int page, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
