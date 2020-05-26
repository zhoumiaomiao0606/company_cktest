package com.cktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.cktest.mapper")
@EnableSwagger2
@EnableTransactionManagement //注解就表示使用Spring事务机制来进行事务管理
public class AppTest {

	public static void main(String[] args) {
		SpringApplication.run(AppTest.class, args);
	}

}
