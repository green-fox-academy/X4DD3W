package fleetofthings;

import java.util.ArrayList;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {
  // Field
  private ArrayList<Thing> things;
  // Constructor
  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  //
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}