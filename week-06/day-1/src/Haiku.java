import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Haiku {

  public static void main(String[] args) {
    // Write a Stream Expression to find the frequency of characters in a given string!
    String haiku =

                                     "Vol 4.2 - Jellegzetes"
                                      + "Nemes kezednek,"
                                  + "melyben kezem delelhet,"
                                   + "kedves, nincs párja.";

    Stream<Character> stringToCharStream = haiku.codePoints().mapToObj(s -> (char) s);
    Map<Object, Long> piecesOfAHaiku = stringToCharStream
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(piecesOfAHaiku);
  }
}
