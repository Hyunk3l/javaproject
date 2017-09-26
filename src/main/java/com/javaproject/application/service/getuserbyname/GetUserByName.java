package com.javaproject.application.service.getuserbyname;

import com.javaproject.domain.user.User;
import com.javaproject.domain.user.UserRepository;

public class GetUserByName {

  private final UserRepository userRepository;

  public GetUserByName(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public GetUserByNameResponse execute(String name) {

    User user = userRepository.findOneBy(name);

    return new GetUserByNameResponse(
        user.getId(),
        user.getName()
    );
  }
}
