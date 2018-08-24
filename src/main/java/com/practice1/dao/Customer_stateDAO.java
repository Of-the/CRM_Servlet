package com.practice1.dao;

import com.practice1.model.Customer_state;

public interface Customer_stateDAO extends BaseDAO<Customer_state>  {
	public Customer_state updateByID(int id);
}
