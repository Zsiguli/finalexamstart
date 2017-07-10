import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> thingsToJoin = new ArrayList<>(Arrays.asList("first", "second", "third"));

    System.out.println(joiner(thingsToJoin, "b"));

    Version2 version2 = new Version2(thingsToJoin);
    System.out.println(version2.joiner("a"));
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
