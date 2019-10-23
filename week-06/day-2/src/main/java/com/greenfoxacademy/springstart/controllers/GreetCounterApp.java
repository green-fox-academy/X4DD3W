package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCounterApp {

  // Open http://localhost:8080/web/greetingtext?name=Your%20name in your web browser

  AtomicLong val = new AtomicLong();

  @RequestMapping(value = "/greetingtext")
  @ResponseBody
  public String greeting(@RequestParam String name) {
    val.addAndGet(1);
    return "Hello, " + name + "! This site was loaded " + val + " times since last server start.";
  }

}
