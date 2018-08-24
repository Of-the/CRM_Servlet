package com.practice1.dao;

import com.practice1.model.Customer_category;

public interface Customer_categoryDAO extends BaseDAO<Customer_category>  {
	public Customer_category updateByID(int id);
}
