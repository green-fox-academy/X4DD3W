package com.x4dd3w.connecttomysql;

import com.x4dd3w.connecttomysql.models.Assignee;
import com.x4dd3w.connecttomysql.models.Todo;
import com.x4dd3w.connecttomysql.repositories.AssigneeRepository;
import com.x4dd3w.connecttomysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnecttomysqlApplication implements CommandLineRunner {

  private ToDoRepository toDoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public ConnecttomysqlApplication (ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
    this.toDoRepository = toDoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnecttomysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Assignee lacika = new Assignee("Lacika", "email@email.hu");
    Assignee cucli = new Assignee("Cucli", "email@email.hu");
    Assignee genyo = new Assignee("Genyó", "email@email.hu");

    Todo teendo = new Todo("teendo1", false, false);
    Todo teendo2 = new Todo("teendo2", true, true);
    Todo teendo3 = new Todo("teendo3", false, true);
    Todo teendo4 = new Todo("teendo4", false, true);
    Todo teendo5 = new Todo("teendo5", false, false);
    Todo teendo6 = new Todo("teendo6", true, true);

    lacika.addTodo(teendo);
    lacika.addTodo(teendo2);
    lacika.addTodo(teendo3);
    cucli.addTodo(teendo4);
    cucli.addTodo(teendo5);
    genyo.addTodo(teendo6);

    assigneeRepository.save(lacika);
    assigneeRepository.save(cucli);
    assigneeRepository.save(genyo);
  }
}
