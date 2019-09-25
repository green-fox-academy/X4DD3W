package fleetofthings;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing {
  // Fields
  private String name;
  private boolean completed;
  // Constructor
  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  // if "completed" true, [x], else [ ]
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}