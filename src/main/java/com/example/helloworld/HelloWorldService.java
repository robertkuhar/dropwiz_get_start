package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldService extends Application<HelloWorldConfiguration> {
  public static void main(String[] args) throws Exception {
    new HelloWorldService().run(args);
  }

  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }

  @Override
  public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
  }

  @Override
  public void run(HelloWorldConfiguration configuration, Environment environment) {
    // Register your DropWizard Health checks...
    final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
    environment.healthChecks().register("template", healthCheck);
    // Register your Jersey Resources...
    final HelloWorldResource resource =
        new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName());
    environment.jersey().register(resource);
  }
}