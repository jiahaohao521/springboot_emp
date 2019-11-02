package jiahao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jiahao.MainClass;
import com.jiahao.bean.Emp;
import com.jiahao.dao.EmpMapper;
import com.jiahao.service.EmpService;
import com.jiahao.web.controller.EmpController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={MainClass.class})
public class testSql {

	@Autowired
	EmpService empService;
	
	@Autowired
	EmpController empController;
	
	@Test
	public void testSql(){
		
		System.out.println(empController);
		
		//查询全部
//		List<Emp> emps = empService.findAll();
//		for (Emp emp : emps) {
//			System.out.println(emp);
//		}
		
		//查询单个
//		Emp emp = empService.findOne(2);
//		System.out.println(emp);
		
		//插入(有乱码，待解决)
//		empService.insert(new Emp(null,"赵信",new Date(),new Date(),new Date(1)));
		
		//修改
//		Emp emp = new Emp();
//		emp.setEid(3);
//		emp.setEname("abs");
//		emp.setUpdatetime(new Date());
//		empService.update(emp);
		
		//删除
//		empService.delete(3);
//		System.out.println("执行成功!");
	}
	
}
