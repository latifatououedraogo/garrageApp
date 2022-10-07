package io.spring.garrageApp.repository;

import io.spring.garrageApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
