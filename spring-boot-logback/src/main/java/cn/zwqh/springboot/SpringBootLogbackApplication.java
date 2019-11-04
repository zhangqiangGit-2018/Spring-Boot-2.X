package cn.zwqh.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zwqh.springboot.dao")
public class SpringBootLogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackApplication.class, args);
	}

}
