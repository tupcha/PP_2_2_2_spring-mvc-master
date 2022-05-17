package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCar(List<Car> cars, int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
