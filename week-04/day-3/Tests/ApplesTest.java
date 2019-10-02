import static org.junit.Assert.*;

public class ApplesTest {

  @org.junit.Test
  public void getApple() {
    Apples jonagold = new Apples();
    String result = jonagold.getApple();
    assertEquals(result, "apple");
  }
}