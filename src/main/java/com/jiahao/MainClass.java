package com.jiahao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 * @author Administrator
 *
 */
@SpringBootApplication
@MapperScan("com.jiahao.dao")//扫描dao层
public class MainClass {

	public static void main(String[] args) {
		
		SpringApplication.run(MainClass.class, args);
		
	}
}
