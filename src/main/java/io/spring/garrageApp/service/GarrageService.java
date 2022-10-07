package io.spring.garrageApp.service;

import io.spring.garrageApp.model.Car;
import io.spring.garrageApp.repository.GarageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarrageService {

    private GarageRepository garageRepository;
 /*  static private ArrayList<Car> cars= new ArrayList<>(Arrays.asList(
            new Car(1L,"BMW","BMW",2022, Car.Color.RED),
            new Car(2L,"Runner","BMW",2022, Car.Color.BLUE),
            new Car(3L,"RangeRover","Toyota",2022, Car.Color.GREEN),
            new Car(4L,"4*4","Toyota",2022, Car.Color.RED)
    ));*/

    public List<Car> getCars(){
        List<Car> cars=new ArrayList<>();
        garageRepository.findAll().forEach(car -> {
            cars.add(car);
        });
        return cars;
    }

    public Car getById(long id){

        return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id){
        garageRepository.deleteById(id);
        //cars.removeIf(car -> car.getId()==id);
    }

    public void addCar(Car car){
        garageRepository.save(car);
        //cars.add(car);
    }

    public void update(Car car,long id){
        /*cars.forEach(car1 -> {
            if(car1.getId()==id){
                cars.set(cars.indexOf(car1), car);
            }
        });*/
        garageRepository.save(car);

    }

}
