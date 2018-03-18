package com.sdu.mobilesale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdu.mobilesale.mapper")
public class MobilesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilesaleApplication.class, args);
	}
}
