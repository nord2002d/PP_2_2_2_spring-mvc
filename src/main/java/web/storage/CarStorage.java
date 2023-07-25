package web.storage;

import web.model.Car;

import java.util.List;

public class CarStorage {
    private static final String FURL_1 = "gasoline";
    private static final String FURL_2 = "diesel";

    private CarStorage() {
    }

    private static List<Car> carList = List.of(new Car(1, "Ford", FURL_2),
            new Car(2, "Mazda", FURL_1),
            new Car(3, "Nissan", FURL_1),
            new Car(4, "Audi", FURL_1),
            new Car(5, "BMW", FURL_2));

    public static List<Car> getCarList() {
        return carList;
    }
}
