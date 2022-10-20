package coordinate.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoordinateTest {

  @Test
  void calculate() {
    Coordinate c1 = new Coordinate(10, 10);
    Coordinate c2 = new Coordinate(14, 15);

    CoordinateDistance cd = new CoordinateDistance(c1, c2);

    double result = cd.calculateDistance();
    assertEquals(6.403124, result, 0.00004);
  }
}