package models;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private AtomicLong greetCount;
  private String content;

  public Greeting(AtomicLong id, String content) {
    this.greetCount = id;
    this.content = content;
  }

  public AtomicLong getGreetCount() {
    return greetCount;
  }

  public String getContent() {
    return content;
  }

}
