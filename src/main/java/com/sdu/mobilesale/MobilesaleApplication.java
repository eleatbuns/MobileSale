package com.sdu.mobilesale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.sdu.mobilesale.mapper")
@ComponentScan(basePackages = {"com.sdu.mobilesale.*"})
@EnableAutoConfiguration
@EnableCaching
@EnableTransactionManagement
public class MobilesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesaleApplication.class, args);
	}
}
