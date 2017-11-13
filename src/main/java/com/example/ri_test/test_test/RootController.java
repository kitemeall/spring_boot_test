package com.example.ri_test.test_test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {


  @GetMapping("/")
  public String getHello() {
    return "Hello";
  }
}