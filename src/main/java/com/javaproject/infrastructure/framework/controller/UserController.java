package com.javaproject.infrastructure.framework.controller;

import com.javaproject.application.service.getuserbyname.GetUserByName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final GetUserByName getUserByName;

  public UserController(GetUserByName getUserByName) {
    this.getUserByName = getUserByName;
  }

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public ResponseEntity getUser(@PathVariable("name") String name) {
    return ResponseEntity.ok(getUserByName.execute(name));
  }
}
