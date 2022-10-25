package rentcompany.domain;

public class Avante extends AbstractCar{

  public static final double DISTANCE_PER_LITER = 15;

  String name;
  public Avante(double distance) {
    super(distance, DISTANCE_PER_LITER);
    this.name = "Avante";
  }

  @Override
  public String getName() {
    return name;
  }
}
