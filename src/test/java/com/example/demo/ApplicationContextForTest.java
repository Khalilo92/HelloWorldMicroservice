package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:application.properties"})
@ComponentScan("com.example.demo")

public class ApplicationContextForTest {

  @Autowired
  Environment environment;

  public ApplicationContextForTest() {
    // empty constructor is on purpose
  }




}
