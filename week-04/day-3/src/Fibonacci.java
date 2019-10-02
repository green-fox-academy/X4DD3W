public class Fibonacci {

  // Write a function that computes a member of the fibonacci sequence by a given index
  // Create tests for multiple test cases.

  public int fibonacci(int n) {
    n = Math.abs(n);
    if ((n == 0) || (n == 1)) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

}
