import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
  @Test
  public void testJoiner_withEmptyList() {
    List<String> testList = Arrays.asList();
    String separator = "b";
    assertEquals("", Main.joiner(testList, separator));
  }
}