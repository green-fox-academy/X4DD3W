package com.x4dd3w.tododatabase;

import com.x4dd3w.tododatabase.models.Todo;
import com.x4dd3w.tododatabase.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TododatabaseApplication implements CommandLineRunner {

  @Autowired
  private ToDoRepository repository;

  @Autowired
  public TododatabaseApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TododatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save((new Todo("Start the day")));
    repository.save((new Todo("Finish H2 workshop1")));
    repository.save((new Todo("Write a haiku")));
    repository.save((new Todo("I have to learn Object Relational Mapping")));
  }
}
