package rentcompany.domain;

public class Sonata extends AbstractCar{

  public static final double DISTANCE_PER_LITER = 10;

  String name;

  public Sonata(double distance) {
    super(distance, DISTANCE_PER_LITER);
    this.name = "Sonata";
  }

  @Override
  public String getName() {
    return this.name;
  }
}
