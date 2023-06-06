package com.overview.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

  @GetMapping("/")
  public String home() {
    return "Home Page";
  }

  @GetMapping("/workout")
  public String workout() {
    return "Workout Run 500 kilometers.";
  }

  @GetMapping("/fortune")
  public String fortune() {
    return "Fortune end point";
  }

}
