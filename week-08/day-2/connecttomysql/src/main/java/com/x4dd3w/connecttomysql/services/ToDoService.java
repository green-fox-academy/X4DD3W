package com.x4dd3w.connecttomysql.services;

import com.x4dd3w.connecttomysql.models.Todo;
import java.util.List;

public interface ToDoService {

  List<Todo> showActiveToDos(Boolean isActive);

  Todo findById(Long id);

  List<Todo> searched(String title);
}
