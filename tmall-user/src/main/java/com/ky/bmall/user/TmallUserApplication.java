package com.ky.bmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ky.bmall.user.mapper")
public class TmallUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(TmallUserApplication.class, args);
  }
}
