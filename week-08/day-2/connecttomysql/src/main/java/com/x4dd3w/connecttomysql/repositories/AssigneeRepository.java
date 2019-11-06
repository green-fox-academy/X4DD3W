package com.x4dd3w.connecttomysql.repositories;

import com.x4dd3w.connecttomysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
