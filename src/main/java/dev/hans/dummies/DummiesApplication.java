package dev.hans.dummies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DummiesApplication {

  public static void main(String[] args) {
    SpringApplication.run(DummiesApplication.class, args);
  }

}
