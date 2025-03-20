package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao dao;
    private final List<Car> cars;

    @Autowired
    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
        this.cars = dao.getCars();
    }

    @Override
    public List<Car> getCars(Integer n) {
        try {
            return cars.subList(0, n);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            return cars;
        }

    }
}
