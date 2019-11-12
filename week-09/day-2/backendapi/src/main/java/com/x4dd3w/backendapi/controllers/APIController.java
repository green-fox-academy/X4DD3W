package com.x4dd3w.backendapi.controllers;

import com.x4dd3w.backendapi.models.AppendA;
import com.x4dd3w.backendapi.models.ArrayHandler;
import com.x4dd3w.backendapi.models.ArrayHandlerInput;
import com.x4dd3w.backendapi.models.ArrayHandlerListResult;
import com.x4dd3w.backendapi.models.DoUntil;
import com.x4dd3w.backendapi.models.DoUntilInput;
import com.x4dd3w.backendapi.models.Doubling;
import com.x4dd3w.backendapi.models.Greeter;
import com.x4dd3w.backendapi.models.MyError;
import com.x4dd3w.backendapi.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @Autowired
  Service service;

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

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendA(@PathVariable(required = false) String appendable) {
    if (appendable == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(required = false) String action,
      @RequestBody DoUntilInput until) {
    if (action.equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntil(service.sum(until.getUntil())));
    } else if (action.equals("factor")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new DoUntil(service.factor(until.getUntil())));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity arrayHandler(@RequestBody ArrayHandlerInput input) {
    if (input.getWhat() == null || input.getNumbers() == null) {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide what to do with the numbers!"));
    } else {
      switch (input.getWhat()) {
        case "sum":
          return ResponseEntity.status(HttpStatus.OK).body(new ArrayHandler(service.sumArray(input.getNumbers())));
        case "multiply":
          return ResponseEntity.status(HttpStatus.OK).body(new ArrayHandler(service.multiplyArray(input.getNumbers())));
        case "double":
          return ResponseEntity.status(HttpStatus.OK).body(new ArrayHandlerListResult(service.doubleArray(input.getNumbers())));
        default:
          return new ResponseEntity(HttpStatus.BAD_REQUEST);
      }
    }
  }
}
