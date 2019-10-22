package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  AtomicLong val = new AtomicLong();

  @RequestMapping (value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name) {
    val.addAndGet(1);
    return new Greeting(val, "Hello, " + name);
  }

}
