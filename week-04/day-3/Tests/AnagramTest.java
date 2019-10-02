import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void anagramOrNot_TwoStrings_ReturnsTrue() {
    Anagram test = new Anagram();
    String one = "mama";
    String two = "maam";
    boolean result = test.anagramOrNot(one, two);
    assertEquals(result, true);
  }

  @Test
  public void anagramOrNot_DiffLength_ReturnsFalse() {
    Anagram test = new Anagram();
    String one = "mama";
    String two = "mamam";
    boolean result = test.anagramOrNot(one, two);
    assertEquals(result, false);
  }

  @Test
  public void anagramOrNot_SameLengthNotAnagram_ReturnsFalse() {
    Anagram test = new Anagram();
    String one = "mama";
    String two = "mamm";
    boolean result = test.anagramOrNot(one, two);
    assertEquals(result, false);
  }

  @Test
  public void anagramOrNot_OneEmptyStr_ReturnsFalse() {
    Anagram test = new Anagram();
    String one = "mama";
    String two = "";
    boolean result = test.anagramOrNot(one, two);
    assertEquals(result, false);
  }
  
}



