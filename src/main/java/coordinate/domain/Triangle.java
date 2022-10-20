package coordinate.domain;

import coordinate.CoordinateUtils;

public class Triangle {

  private final double x;
  private final double y;
  private final double z;
  private final double s;

  public Triangle(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.s = CoordinateUtils.setNumberPoint((x + y + z) / 2);
  }

  public double calculateArea() {
    System.out.println(x + ", " + y + ", " + z + ", " + s);
    return CoordinateUtils.setNumberPoint(Math.sqrt(s * (s - x) * (s - y) * (s - z)));
  }

}
