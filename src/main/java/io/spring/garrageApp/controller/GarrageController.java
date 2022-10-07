package io.spring.garrageApp.controller;

import io.spring.garrageApp.model.Car;
import io.spring.garrageApp.service.GarrageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GarrageController {

    @Autowired

    private GarrageService  garrageService;

    @GetMapping("/")
    public String hello(){
        return "hello!!!!!!!";
    }

    @RequestMapping("/cars")
    public List<Car> getCard(){

        return garrageService.getCars();
   }

   @RequestMapping("/car/{id}")
   public Car getCar(@PathVariable Long id){
        return garrageService.getById(id);
   }

   @RequestMapping(method = RequestMethod.DELETE,value = "/car/{id}")
   public void deleteCar(@PathVariable long id){
       garrageService.deleteCar(id);
   }

   @RequestMapping(method = RequestMethod.POST,value = "/cars")
   public void addCar(@RequestBody Car car){
        garrageService.addCar(car);
   }

   @RequestMapping(method = RequestMethod.PUT,value = "/car/{id}")
   public void updateCar(@RequestBody Car car,@PathVariable long id){
        garrageService.update(car,id);
   }
}
