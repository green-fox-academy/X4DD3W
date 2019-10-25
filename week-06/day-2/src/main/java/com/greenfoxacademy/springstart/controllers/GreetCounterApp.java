package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetCounterApp {

  AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greetingtext")
  @ResponseBody
  public String greeting(@RequestParam String name) {
    counter.addAndGet(1);
    return "Hello, " + name + "! This site was loaded " + counter + " times since last server start.";
  }
}
