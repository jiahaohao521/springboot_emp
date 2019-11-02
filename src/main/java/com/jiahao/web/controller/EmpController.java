package com.jiahao.web.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiahao.bean.Emp;
import com.jiahao.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpController {

	@Autowired
	EmpService empService;
	
	
	public void hello(){
		
	}
	
	/**
	 * 查询全部
	 * @return
	 */
	@RequestMapping("findAll")
	public List<Emp> findAll(){
		System.out.println("进入controller方法findAll...");
		System.out.println("查询全部方法...");
		List<Emp> emps = empService.findAll();
		return emps;
	}
	
	/**
	 * 根据id查询
	 * @param eid
	 * @return
	 */
	@RequestMapping("findOne")
	public Emp findOne(Integer eid){
		System.out.println("要查询的id：" + eid);
		return empService.findOne(eid);
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("delete")
	public void delete(Integer eid){
		System.out.println("要删除的id：" + eid);
		empService.delete(eid);
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("update")
	public void update(@RequestBody Emp emp){
		System.out.println("要修改的emp:" + emp);
		empService.update(emp);
	}
	
	/**
	 * 添加
	 */
	@RequestMapping("insert")
	public void insert(String ename,Date birthday){
		System.out.println("进入方法..." + ename + birthday);
		Emp emp = new Emp();
		emp.setEid(null);
		emp.setEname(ename);
		//注意点，页面传来的为sql类型的date，需转换成util类型的
		long time = birthday.getTime();
		java.util.Date ubridhday = new java.util.Date(time);
		emp.setBridhday(ubridhday);
		emp.setCreatetime(new java.util.Date());
		emp.setUpdatetime(new java.util.Date());
		empService.insert(emp);
	}
}
