package com.x4dd3w.backendapi.repositories;

import com.x4dd3w.backendapi.models.Log;
import com.x4dd3w.backendapi.models.LogEntry;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LogRepo extends CrudRepository<Log, Long> {

  @Query(value = "SELECT * FROM apilog.log", nativeQuery = true)
  List<LogEntry> listAllLogEntries();
}
