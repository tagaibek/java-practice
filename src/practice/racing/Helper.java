package practice.racing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 10.06.2017.
 */
public class Helper {
    public static List<Car> getCars() {
        Ferrari ferrari = new Ferrari("Ferrari",100);
        Buggati buggati = new Buggati("Buggati",130);
        Tesla tesla = new Tesla("Tesls",150);

        List<Car> cars = new ArrayList<>();
        cars.add(buggati);
        cars.add(ferrari);
        cars.add(tesla);

        return cars;
    }
}
