package com.practice1.dao;

import java.util.List;

import com.practice1.model.Department;

public interface DepartmentDAO extends BaseDAO<Department>  {
	public Department updateByID(int id);
	public List<Department> selectByIDname(String name);
	public List<Department> selectyByIDdesc(String desc);
}
