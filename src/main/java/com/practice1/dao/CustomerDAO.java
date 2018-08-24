package com.practice1.dao;

import com.practice1.model.Customer;

public interface CustomerDAO extends BaseDAO<Customer> {
	public Customer updateByID(int id);
}
