package com.javaproject.infrastructure.framework.configuration;

import com.javaproject.application.service.getuserbyname.GetUserByName;
import com.javaproject.infrastructure.framework.controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

  @Bean
  public UserController userController(GetUserByName getUserByName) {
    return new UserController(getUserByName);
  }
}
