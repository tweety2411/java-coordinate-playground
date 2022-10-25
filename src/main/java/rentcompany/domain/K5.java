package rentcompany.domain;

public class K5 extends AbstractCar{

  String name;
  public static final double DISTANCE_PER_LITER = 13;

  public K5(double distance) {
    super(distance, DISTANCE_PER_LITER);
    this.name = "K5";
  }

  @Override
  public String getName() {
    return this.name;
  }
}
