package com.ty.bmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ty.bmall.mapper")
public class ManagerServiceApp {
  public static void main(String[] args) {
      SpringApplication.run(ManagerServiceApp.class,args);
  }
}
