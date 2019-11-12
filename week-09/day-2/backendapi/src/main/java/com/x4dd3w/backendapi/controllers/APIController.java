package com.x4dd3w.backendapi.controllers;

import com.x4dd3w.backendapi.models.Doubling;
import com.x4dd3w.backendapi.models.Greeter;
import com.x4dd3w.backendapi.models.MyError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @GetMapping("/doubling")
  public ResponseEntity<Object> doubling(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<Object> greeter(@RequestParam(required = false) String name, String title) {
    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a title!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Greeter(name, title));
    }
  }
}
