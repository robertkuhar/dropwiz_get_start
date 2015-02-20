package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration {
  @NotEmpty
  @JsonProperty
  private String template;

  @NotEmpty
  @JsonProperty
  private String defaultName = "Stranger";

  public String getTemplate() {
    return template;
  }

  public String getDefaultName() {
    return defaultName;
  }
}
