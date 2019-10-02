import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SumTest {

  @Test
  public void sum_Normal_ReturnsAnInteger() {
    Sum test = new Sum();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(7, 13, 20));
    int result = test.sum(testList);
    assertEquals(result, 40);
  }

  @Test
  public void sum_EmptyList_ReturnsZero() {
    Sum test = new Sum();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList());
    int result = test.sum(testList);
    assertEquals(result, 0);
  }

  @Test
  public void sum_OneElementInList_ReturnsSeven() {
    Sum test = new Sum();
    ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(7));
    int result = test.sum(testList);
    assertEquals(result, 7);
  }

  @Test
  public void sum_EmptyList_ReturnsNull() {
    Sum test = new Sum();
    ArrayList<Integer> testList = null;
    Integer result = test.sum(testList);
    assertEquals(result, null);
  }



}