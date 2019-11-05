package com.x4dd3w.tododatabase.repositories;

import com.x4dd3w.tododatabase.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo, Long> {

}
