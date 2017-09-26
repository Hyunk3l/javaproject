package com.javaproject.infrastructure.framework.domain.user.postgres;

public class PostgresUser {
  private final String id;
  private final String name;

  public PostgresUser(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
