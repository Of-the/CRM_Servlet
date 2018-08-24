package com.practice1.dao;
import com.practice1.model.Customer_care;

public interface Customer_careDAO extends BaseDAO<Customer_care>  {
	public Customer_care updateByID(int id);

	
}
