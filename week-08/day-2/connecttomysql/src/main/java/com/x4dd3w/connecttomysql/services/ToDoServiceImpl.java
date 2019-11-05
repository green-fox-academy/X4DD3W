package com.x4dd3w.connecttomysql.services;

import com.x4dd3w.connecttomysql.models.Todo;
import com.x4dd3w.connecttomysql.repositories.ToDoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

  @Autowired
  private ToDoRepository repository;

  @Override
  public List<Todo> showActiveToDos(Boolean isActive) {
    if (!isActive) {
      return ((List<Todo>) repository.findAll()).stream().filter(todo -> todo.isDone()).collect(
          Collectors.toList());
    } else {
      return ((List<Todo>) repository.findAll()).stream().filter(todo -> !todo.isDone()).collect(
          Collectors.toList());
    }
  }

  @Override
  public Todo findById(Long id) {
    return repository.findById(id).orElse(null);
  }
}
