package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Saying {
  private final long id;
  private final String content;

  @JsonCreator
  public Saying(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}