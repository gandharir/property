package com.example.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

  @Value("${my.greeting}")
  public String greetingText;

  @GetMapping("/greeting")
  public String greeting(){
    return greetingText;
  }
}
