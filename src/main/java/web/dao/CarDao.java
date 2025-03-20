package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private final List<Car> cars;

    public CarDao() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Carola", "2017"));
        cars.add(new Car("Honda", "Civic", "2010"));
        cars.add(new Car("BMW", "X6", "2016"));
        cars.add(new Car("Porsche", "911", "2020"));
        cars.add(new Car("Lada", "Vesta", "2022"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
