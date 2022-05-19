package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;
import web.service.CarServiceImp;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap modelMap) {
        modelMap.addAttribute("cars", new CarServiceImp().getCars(count));
        return "car";
    }


}
