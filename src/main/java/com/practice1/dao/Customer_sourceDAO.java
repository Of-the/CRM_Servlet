package com.practice1.dao;

import com.practice1.model.Customer_source;

public interface Customer_sourceDAO extends BaseDAO<Customer_source>  {
	public Customer_source updateByID(int id);
}
