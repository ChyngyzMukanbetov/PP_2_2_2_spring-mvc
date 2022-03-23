package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsService {

    public static List<Car> getCarsList(int count) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car (1, "mers", 500));
        carList.add(new Car (2, "bmw", 323));
        carList.add(new Car (3, "toyota", 540));
        carList.add(new Car (4, "lada", 99));
        carList.add(new Car (5, "nissan", 100));

        int j = count;
        if (count >= 5) {
            j = 5;
        }

        List<Car> carsList2 = new ArrayList<>();
        for (int i = 0; i < j; i++) {
            carsList2.add(carList.get(i));
        }

        return carsList2;
    }
}
