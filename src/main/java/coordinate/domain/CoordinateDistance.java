package coordinate.domain;

public class CoordinateDistance {

  private Coordinate c1;
  private Coordinate c2;

  public CoordinateDistance() {

  }

  public CoordinateDistance(Coordinate c1, Coordinate c2) {
    this.c1 = c1;
    this.c2 = c2;
  }

  public double calculateDistance() {
    double x = Math.pow(c1.getX() - c2.getX(), 2);
    double y = Math.pow(c1.getY() - c2.getY(), 2);

    return Math.sqrt(x + y);
  }

}
