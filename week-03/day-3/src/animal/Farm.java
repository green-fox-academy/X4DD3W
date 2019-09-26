package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

  int full = 3;
  List<Animal> list = new ArrayList<Animal>(full);

  public Farm() {
  }

  public void breed() {
    if (list.size() <= full) {
      list.add(new Animal());
    }
  }

  public void slaughter() {
    Animal killHim = new Animal();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).hunger < killHim.hunger) {
        killHim = list.get(i);
      }
    }
    list.remove(killHim);
  }
}
