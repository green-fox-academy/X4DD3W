package com.groot.demo.controllers;

import com.groot.demo.models.MyError;
import com.groot.demo.models.TranslatedToGroot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> grootTranslator(@RequestParam(required = false) String received) {
    if (received == null || received.equals("")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError());
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new TranslatedToGroot(received));
    }
  }
}
