import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

  @Test
  public void counter_Normal() {
    CountLetters test = new CountLetters();
    // HashMap expected = test.counter("alma");
    HashMap<Character, Integer> result = new HashMap<>();
    result.put('a', 2);
    result.put('l', 1);
    result.put('m', 1);
    assertEquals(result, test.counter("alma"));
  }
}