package com.x4dd3w.connecttomysql.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "assignee", fetch = FetchType.LAZY)
  // halmozott cascade, mint minden annotation-nél
  // cascade .save-nél,
  // mappedBy = "assignee" - assignee szolgáltatja a foreign kulcsot a todosban
  // fetch LAZY?!
  private List<Todo> todos;

  public Assignee() {
    todos = new ArrayList<>();
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    todos = new ArrayList<>();
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void addTodo(Todo todo){
    todo.setAssignee(this);
    todos.add(todo);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return this.getName();
  }
}
