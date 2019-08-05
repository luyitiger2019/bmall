package com.ky.bmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ky.tmall.user.mapper")
public class TmallUserApplication {

  public static void main(String[] args) {
    SpringApplication.run(TmallUserApplication.class, args);
  }
}
