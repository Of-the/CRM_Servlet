package com.practice1.dao;

import com.practice1.model.Customer_link_record;

public interface Customer_link_recordDAO extends BaseDAO<Customer_link_record>  {
	public Customer_link_record updateByID(int id);
}
