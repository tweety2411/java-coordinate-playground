package coordinate.domain;

public class Coordinate {

  private final double x;
  private final double y;

  public Coordinate(double x, double y) {
    if (x > 24 || y > 24) {
      throw new IllegalArgumentException("최대 24까지만 입력할 수 있습니다.");
    }
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
