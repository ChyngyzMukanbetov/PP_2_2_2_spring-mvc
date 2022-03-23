package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarsService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        int param;
        if (count == null) {
            param = 5;
        } else {
            param = Integer.parseInt(count);
        }

        List<Car> cars = CarsService.getCarsList(param);

        model.addAttribute("cars", cars);
        return "cars";
    }

//    @GetMapping(value = "/cars")
//    public String printCars(ModelMap model) {
//
//        List<Car> cars = CarsService.getCarsList(5);
//
//        model.addAttribute("cars", cars);
//        return "cars";
//    }
}
