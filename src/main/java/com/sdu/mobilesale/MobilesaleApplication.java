package com.sdu.mobilesale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sdu.mobilesale.mapper")
@ComponentScan(basePackages = {"com.sdu.mobilesale.*"})
@EnableAutoConfiguration
public class MobilesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesaleApplication.class, args);
	}
}
