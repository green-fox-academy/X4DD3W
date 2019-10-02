import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibonacci_Integer_Returns233() {
    Fibonacci test = new Fibonacci();
    int result = test.fibonacci(13);
    assertEquals(result, 233);
  }

  @Test
  public void fibonacci_Zero_ReturnsZero() {
    Fibonacci test = new Fibonacci();
    int result = test.fibonacci(0);
    assertEquals(result, 0);
  }

  @Test
  public void fibonacci_Negative_ReturnsEight() {
    Fibonacci test = new Fibonacci();
    int result = test.fibonacci(-6);
    assertEquals(result, 8);
  }

}