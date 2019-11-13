package com.x4dd3w.backendapi.controllers;

import com.x4dd3w.backendapi.models.AppendA;
import com.x4dd3w.backendapi.models.ArrayHandler;
import com.x4dd3w.backendapi.models.ArrayHandlerInput;
import com.x4dd3w.backendapi.models.ArrayHandlerListResult;
import com.x4dd3w.backendapi.models.DoUntil;
import com.x4dd3w.backendapi.models.DoUntilInput;
import com.x4dd3w.backendapi.models.Doubling;
import com.x4dd3w.backendapi.models.Greeter;
import com.x4dd3w.backendapi.models.Log;
import com.x4dd3w.backendapi.models.LogEntry;
import com.x4dd3w.backendapi.models.MyError;
import com.x4dd3w.backendapi.models.SithText;
import com.x4dd3w.backendapi.models.YodaSpeak;
import com.x4dd3w.backendapi.repositories.LogRepo;
import com.x4dd3w.backendapi.services.APIService;
import java.util.List;
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

  private APIService service;
  private LogRepo logRepo;

  @Autowired
  public APIController(APIService service, LogRepo logRepo) {
    this.service = service;
    this.logRepo = logRepo;
  }

  @GetMapping("/doubling")
  public ResponseEntity<Object> doubling(@RequestParam(required = false) Integer input) {
    Log log = new Log("/doubling", "input=" + input);
    logRepo.save(log);
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<Object> greeter(@RequestParam(required = false) String name, String title) {
    logRepo.save(new Log("/greeter", "name=" + name + ", " + "title=" + title));
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
    logRepo.save(new Log("/appenda/" + appendable, "input=" + appendable));
    if (appendable == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@PathVariable(required = false) String action,
      @RequestBody DoUntilInput until) {
    logRepo.save(new Log("/dountil/" + action, "until=" + until.getUntil()));
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
    logRepo.save(new Log("/arrays", "what=" + input.getWhat() + "," + "numbers=" + input.getNumbers()));
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

  @GetMapping("/log")
  public ResponseEntity logger() {
    return ResponseEntity.status(HttpStatus.OK).body(new LogEntry((List<Log>) logRepo.findAll()));
  }

  @PostMapping("/sith")
  public ResponseEntity sithTranslator(@RequestBody(required = false) SithText text) {
    if (text == null || text.getText().isEmpty()) {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Feed me some text you have to, padawan young you are. Hmmm."));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new YodaSpeak(service.translateToSith(text)));
    }
  }
}

