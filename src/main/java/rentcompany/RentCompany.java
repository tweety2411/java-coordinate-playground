package rentcompany;

import com.sun.org.apache.bcel.internal.generic.NEW;
import java.util.ArrayList;
import java.util.List;
import rentcompany.domain.Car;

public class RentCompany {

  private static final String NEWLINE = System.getProperty("line.separator");
  private static final String COLON_WITH_SPACE = " : ";
  private static final String LITER = "리터";
  private static RentCompany rentCompany = null;

  private List<Car> cars = new ArrayList<>();

  public static RentCompany create() {
    if(rentCompany == null) {
      rentCompany = new RentCompany();
    }
    return rentCompany;
  }

  public void addCar(Car car) {
    cars.add(car);
  }

  public String generateReport() {
    StringBuilder sb = new StringBuilder();

    for(Car car : cars) {
      sb.append(car.getName()).append(COLON_WITH_SPACE)
          .append((int)car.getChargeQuantity()).append(LITER)
          .append(NEWLINE);
    }
    return sb.toString();
  }
}
