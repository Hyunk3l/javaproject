package com.javaproject.infrastructure.framework.configuration;

import com.javaproject.application.service.getuserbyname.GetUserByName;
import com.javaproject.domain.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationServiceConfiguration {
  @Bean
  public GetUserByName getUserByName(UserRepository userRepository) {
    return new GetUserByName(userRepository);
  }
}
