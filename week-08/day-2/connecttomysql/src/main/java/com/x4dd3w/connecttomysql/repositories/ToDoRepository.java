package com.x4dd3w.connecttomysql.repositories;

import com.x4dd3w.connecttomysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<Todo, Long> {

}
