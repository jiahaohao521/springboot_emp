package com.jiahao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiahao.bean.Emp;
import com.jiahao.dao.EmpMapper;
import com.jiahao.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper empMapper;

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return empMapper.selectByExample(null);
	}

	@Override
	public Emp findOne(Integer eid) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(eid);
	}

	@Override
	public void insert(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.insertSelective(emp);
	}

	@Override
	public void update(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.updateByPrimaryKeySelective(emp);
	}

	@Override
	public void delete(Integer eid) {
		// TODO Auto-generated method stub
		empMapper.deleteByPrimaryKey(eid);
	}

}
