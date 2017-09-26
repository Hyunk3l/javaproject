package com.javaproject.infrastructure.framework.configuration;

import com.javaproject.domain.user.UserRepository;
import com.javaproject.infrastructure.framework.domain.user.postgres.PostgresUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class RepositoryConfiguration {
  @Bean
  @Autowired
  public UserRepository userRepository(JdbcTemplate jdbcTemplate) {
    return new PostgresUserRepository(jdbcTemplate);
  }
}
