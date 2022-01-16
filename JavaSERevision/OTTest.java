import java.util.Date;
import java.util.function.Predicate;

public class OTTest implements Predicate<Vehicle> {
    @Override
    public boolean test(Vehicle vehicle) {
        return vehicle.year < new Date().getYear() + 1900 - 30;
    }
}
