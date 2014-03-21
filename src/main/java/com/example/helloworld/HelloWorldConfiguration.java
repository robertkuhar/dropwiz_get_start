package com.example.helloworld;

import org.hibernate.validator.constraints.*;

import com.fasterxml.jackson.annotation.*;
import com.yammer.dropwizard.config.*;

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
