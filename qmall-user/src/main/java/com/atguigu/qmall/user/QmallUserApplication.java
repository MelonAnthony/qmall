package com.atguigu.qmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.qmall.user.mapper")
public class QmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(QmallUserApplication.class, args);
	}

}
