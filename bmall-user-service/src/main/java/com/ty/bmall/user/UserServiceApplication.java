package com.ty.bmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ty.bmall.user.mapper")
public class UserServiceApplication {
  public static void main(String[] args) {
      SpringApplication.run(UserServiceApplication.class,args);
  }
}
