package com.javaproject.infrastructure.framework.domain.user.postgres;

import com.javaproject.domain.user.User;
import com.javaproject.domain.user.UserRepository;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;

public class PostgresUserRepository implements UserRepository {

  private final JdbcTemplate jdbcTemplate;

  public PostgresUserRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public User findOneBy(String name) {

    String query = "SELECT id, name FROM users WHERE name = ? LIMIT 1;";

    Map<String, Object> userFromDb = jdbcTemplate.queryForMap(query, name);

    return new User(
        userFromDb.get("id").toString(),
        userFromDb.get("name").toString()
    );
  }
}
