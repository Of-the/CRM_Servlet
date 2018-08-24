package com.practice1.dao;

import java.util.List;

public interface BaseDAO<E> {
	public void add(E e);
	public void deleteByID(int id);
	public void update(E e);
	public List<E>selectAll();
	public int sum();
	public List<E> selectAllByPage(int page, int count);
}
