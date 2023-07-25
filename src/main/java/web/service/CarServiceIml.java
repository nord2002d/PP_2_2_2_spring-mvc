package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;
import web.storage.CarStorage;

import java.util.List;
@Component
public class CarServiceIml implements CarService {

    @Override
    public List<Car> getCarsList(int count) {

        return CarStorage.getCarList().stream().limit(count).toList();
    }
}
