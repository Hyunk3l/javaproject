package com.javaproject.domain.user;

public interface UserRepository {
  User findOneBy(String name);
}
