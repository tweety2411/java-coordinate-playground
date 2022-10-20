package study.domain;

public class Sonata extends Car {

  private final static double DISTANCE_PER_LITER = 10;
  private final static String NAME = "Sonata";
  private final double distance;
  public Sonata(int distance) {
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
