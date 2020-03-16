package com.cjf.mapper;

import java.util.List;

import com.cjf.dao.Student;

public interface MyBatis {
	public MyBatis insert(int id,String name);
	public MyBatis updata(int id);
	public MyBatis delete();
	public List<Student> select();
}
