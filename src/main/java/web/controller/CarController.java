package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap modelMap) {
        List<Car> carList = new ArrayList<>();
        List<Car> resultLsit;
        CarServiceImp carServiceImp = new CarServiceImp();
        carList.add(new Car("BMW", 180, 139));
        carList.add(new Car("Mercedes", 350, 222));
        carList.add(new Car("Audi", 480, 234));
        carList.add(new Car("Volkswagen", 250, 150));
        carList.add(new Car("RollsRoyce", 170, 300));
        resultLsit = carServiceImp.getCar(carList, count);
        modelMap.addAttribute("resultList", resultLsit);
        return "car";
    }


}
