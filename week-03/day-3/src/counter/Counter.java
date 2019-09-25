package counter;

public class Counter {        // Create "Counter" class

  int integer;                // which has an integer field value
  int num = 0;

  public Counter() {
    integer = 0;              // when creating it should have a default value 0
  }

  public Counter(int x) {     // or we can specify it when creating
    integer = x;
    num = x;
  }

  public void add(int addIt) { // we can add(number) to this counter another whole number
    integer = integer + addIt;
  }

  public void add() {         // or we can add() without parameters just increasing the counter's value by one
    integer += 1;
  }

  public int get() {          // and we can get() the current value
    return integer;
  }

  public void reset() {       // also we can reset() the value to the initial value
    integer = num;
  }


}
