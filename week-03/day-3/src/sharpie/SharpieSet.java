package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  // it contains a list of Sharpie
  // countUsable() -> sharpie is usable if it has ink in it
  // removeTrash() -> removes all unusable sharpies

  List<Sharpie> list = new ArrayList<>();

  public SharpieSet() {
  }

  public boolean countUsable(Sharpie usableSharpie) {
    return usableSharpie.inkAmount > 0;
  }

  public void removeTrash() {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).inkAmount > 0) {
      } else {
        list.remove(i);
      }
    }
  }
}
