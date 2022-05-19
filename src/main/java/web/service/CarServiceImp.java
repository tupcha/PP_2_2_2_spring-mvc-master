package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<>();

    @Autowired
    public CarServiceImp() {
        this.cars = addCars();
    }

    @Override
    public List<Car> addCars() {
        cars.add(new Car("BMW", 180, 139));
        cars.add(new Car("Mercedes", 350, 222));
        cars.add(new Car("Audi", 480, 234));
        cars.add(new Car("Volkswagen", 250, 150));
        cars.add(new Car("RollsRoyce", 170, 300));
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(cars.get(i));
        }
        return list;
    }
}
