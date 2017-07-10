import java.util.List;

public class Version2 {

  public Version2(List<String> thingsToJoin) {
    this.thingsToJoin = thingsToJoin;
  }

  private List<String> thingsToJoin;

  public String joiner(String separator) {
    String joinedString = "";
    for (String str : thingsToJoin) {
      if (joinedString.equals("")) {
        joinedString = str;
      } else {
        joinedString += separator + str;
      }
    }
    return joinedString;
  }
}
