package com.practice1.dao;

import com.practice1.model.User;

public interface UserDAO extends BaseDAO<User> {
	public User updateByID(int id);
	public User searchByUsername(String user_name);
	public User selectByIDname(String name);
	public User selectyByIDdesc(String desc);
}
