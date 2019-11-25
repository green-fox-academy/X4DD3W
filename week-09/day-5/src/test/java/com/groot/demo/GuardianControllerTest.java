package com.groot.demo;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.groot.demo.controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void GuardianController_WithGivingParameter() throws Exception {
    mockMvc.perform(get("/groot")
        .param("message", "lol!"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("lol!")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  //Write the below tests:
  //With giving a parameter:
    //the status is ok
    //the given response is the same as expected
  //Without giving a parameter:
  //the status is not ok
  //the given error response is the same as expected

}
