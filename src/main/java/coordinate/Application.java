package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.CoordinateDistance;
import coordinate.domain.Point;
import coordinate.domain.Triangle;
import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    System.out.println("좌표를 입력하세요.");
    Scanner sc = new Scanner(System.in);
    String coordinate = sc.nextLine();

    if (!CoordinateUtils.isMatched(coordinate)) {
      throw new IllegalArgumentException("입력값이 올바르지 않습니다");
    }

    List<Double> numbers = CoordinateUtils.getNumbers(coordinate);
    
    // 두 점 사이의 거리
    if(numbers.size() == 4) {
      Coordinate c1 = new Coordinate(numbers.get(0), numbers.get(1));
      Coordinate c2 = new Coordinate(numbers.get(2), numbers.get(3));
      CoordinateDistance cd = new CoordinateDistance(c1, c2);

      double result = cd.calculateDistance();

      System.out.println("두 점 사이 거리는 " + String.format("%.6f", result));

    }

    // 사각형
    if (numbers.size() == 8) {
      Coordinate c1 = new Coordinate(numbers.get(0), numbers.get(1));
      Coordinate c2 = new Coordinate(numbers.get(2), numbers.get(3));
      CoordinateDistance cd = new CoordinateDistance(c1, c2);

      double x = cd.calculateDistance();

      Coordinate c3 = new Coordinate(numbers.get(4), numbers.get(5));
      CoordinateDistance cd2 = new CoordinateDistance(c2, c3);

      double y = cd2.calculateDistance();

      Point point = new Point(x, y);
      double result = point.squareArea();

      System.out.println("사각형 넓이는 " + (int)result);
    }

    // 삼각형
    if (numbers.size() == 6) {
      Coordinate c1 = new Coordinate(numbers.get(0), numbers.get(1));
      Coordinate c2 = new Coordinate(numbers.get(2), numbers.get(3));
      CoordinateDistance cd = new CoordinateDistance(c1, c2);

      double x = CoordinateUtils.setNumberPoint(cd.calculateDistance());

      Coordinate c3 = new Coordinate(numbers.get(4), numbers.get(5));
      CoordinateDistance cd2 = new CoordinateDistance(c2, c3);

      double y = CoordinateUtils.setNumberPoint(cd2.calculateDistance());


      CoordinateDistance cd3 = new CoordinateDistance(c3, c1);

      double z = CoordinateUtils.setNumberPoint(cd3.calculateDistance());

      Triangle tri = new Triangle(x, y, z);
      double result = tri.calculateArea();

      System.out.println("삼각형 넓이는 " + Math.round(result));
    }

  }


}
