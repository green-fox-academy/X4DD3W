package com.x4dd3w.backendapi.models;

import java.util.List;

public class LogEntry {

  private List<Log> entries;
  private int entry_count;

  public LogEntry() {

  }

  public LogEntry(List<Log> entries) {
    this.entries = entries;
    this.entry_count = entries.size();
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public void addLog(Log log){
    entries.add(log);
  }
}
