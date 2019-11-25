package com.groot.demo.controllers;

import com.groot.demo.models.Arrow;
import com.groot.demo.models.Cargo;
import com.groot.demo.models.MyError;
import com.groot.demo.models.TranslatedToGroot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardianController {

  private Cargo cargo = new Cargo();

  @GetMapping("/groot")
  public ResponseEntity<?> grootTranslator(@RequestParam(required = false) String received) {
    if (received == null || received.equals("")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError());
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new TranslatedToGroot(received));
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity<?> yondusArrow(
      @RequestParam(required = false) Double distance,
      @RequestParam(required = false) Double time) {
    if (distance == null || time == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("I'm Mary Poppins, Y'all!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Arrow(distance, time));
    }
  }

  @GetMapping("/rocket")
  public ResponseEntity<?> rorasCargo() {
    return ResponseEntity.status(HttpStatus.OK).body(this.cargo);
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity<?> rorasCargoFill(
      @RequestParam(required = false) Double caliber,
      @RequestParam(required = false) Integer amount) {
    if (caliber == null || amount == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Oh, yeah!"));
    } else {
      this.cargo.cargoFiller(caliber, amount);
      return ResponseEntity.status(HttpStatus.OK).body(this.cargo);
    }
  }
}
