package com.practice1.dao;

import java.util.List;
import com.practice1.model.Notice;

public interface NoticeDAO extends BaseDAO<Notice>  {
	public Notice updateByID(int id);
	public List<Notice> selectByIDname(String name,int page, int count);
	public List<Notice> selectyByIDdesc(String desc,int page, int count);
	public int sum(String name);
	public int sun(String name);
}
