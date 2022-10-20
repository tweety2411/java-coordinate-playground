package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoordinateUtils {

//  private static final Pattern COORDINATE_PATTERN = Pattern.compile("^\\([0-9]+[,][0-9]+\\)[-]\\([0-9]+[,][0-9]+\\)$");

  private static final Pattern COORDINATE_PATTERN = Pattern.compile("(\\([0-9]+[,][0-9]+\\))+[-]?$");
  public static final Pattern GET_NUMBER = Pattern.compile("([0-9]+)");

  public static boolean isMatched(String checkStr) {
    return COORDINATE_PATTERN.matcher(checkStr).find();
  }

  public static List<Double> getNumbers(String coordinate) {
    Matcher matcher = GET_NUMBER.matcher(coordinate);
    List<Double> numbers = new ArrayList<>();
    while(matcher.find()) {
      numbers.add(Double.valueOf(matcher.group()));
    }
    return numbers;
  }

  public static double setNumberPoint(double num) {
    return Math.round(num * 10) / 10.0;
  }
}
