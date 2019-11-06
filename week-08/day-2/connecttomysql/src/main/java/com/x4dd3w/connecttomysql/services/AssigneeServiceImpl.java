package com.x4dd3w.connecttomysql.services;

import com.x4dd3w.connecttomysql.models.Assignee;
import com.x4dd3w.connecttomysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  @Autowired
  private AssigneeRepository assigneeRepository;

  @Override
  public Assignee findById(Long id) {
    return assigneeRepository.findById(id).orElse(null);
  }

}
