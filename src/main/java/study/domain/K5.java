package study.domain;


public class K5 extends Car{

  private final static double DISTANCE_PER_LITER = 13;

  private final static String NAME = "K5";
  private final double distance;
  public K5(int distance) {
    this.distance = distance;
  }

  @Override
  double getDistancePerLiter() {
    return DISTANCE_PER_LITER;
  }

  @Override
  double getTripDistance() {
    return distance;
  }

  @Override
  String getName() {
    return NAME;
  }
}
