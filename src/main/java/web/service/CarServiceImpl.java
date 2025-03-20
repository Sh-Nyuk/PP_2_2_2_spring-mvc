package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao dao;

    @Autowired
    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCars(Integer n) {
        if (n != null && n < dao.getCars().size()) {
            return dao.getCars().subList(0, n);
        } else {
            return dao.getCars();
        }
    }
}
