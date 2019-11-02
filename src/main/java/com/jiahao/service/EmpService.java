package com.jiahao.service;

import java.util.List;

import com.jiahao.bean.Emp;

public interface EmpService {
	
	List<Emp> findAll();
	
	Emp findOne(Integer eid);
	
	void insert(Emp emp);
	
	void update(Emp emp);
	
	void delete(Integer eid);

}
