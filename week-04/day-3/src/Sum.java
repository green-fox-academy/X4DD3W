import java.util.ArrayList;

public class Sum {

  public Integer sum(ArrayList<Integer> list){
    Integer sum = 0;
    if (list == null) {
      return null;
    }
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }

}
