package web;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {
    @Autowired
    private CarRepository carrepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return carrepository.findAll();
    }

}
