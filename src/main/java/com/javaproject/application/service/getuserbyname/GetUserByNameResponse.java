package com.javaproject.application.service.getuserbyname;

public class GetUserByNameResponse {
  private final String id;
  private final String name;

  public GetUserByNameResponse(String id, String name) {
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
