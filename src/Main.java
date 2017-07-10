import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println(joiner(new ArrayList<>(Arrays.asList("first", "second", "third")), "b"));
  }

  public static String joiner(List<String> stringsToJoin, String separator) {
    String joinedString = "original";
    for (String str : stringsToJoin) {
      if (joinedString.equals("original")) {
        joinedString = str;
      } else {
        joinedString += separator + str;
      }
    }
    return joinedString;
  }
}
