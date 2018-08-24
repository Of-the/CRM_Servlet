package com.practice1.dao;


import com.practice1.model.Role;

public interface RoleDAO  extends BaseDAO<Role> {
	public Role updateByID(int id);
	public Role selectByIDname(String name);
	public Role selectyByIDdesc(String desc);
}	
