package study.domain;

public class Avante extends Car{

  private final static double DISTANCE_PER_LITER = 15;
  private final static String NAME = "Avante";
  private final double distance;

  public Avante(int distance) {
    this.distance = distance;
  }

  @Override
  double getDistancePerLiter() {
    return DISTANCE_PER_LITER;
  }

  @Override
  double getTripDistance() {
    return this.distance;
  }

  @Override
  String getName() {
    return NAME;
  }

}
