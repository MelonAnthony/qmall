package com.atguigu.qmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.qmall.user.mapper")
public class QmallUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(QmallUserApplication.class, args);
	}

}
