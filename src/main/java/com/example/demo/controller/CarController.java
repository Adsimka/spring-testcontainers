package com.example.demo.controller;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController
{
    private final CarRepository carRepository;

    @GetMapping("")
    public List<Car> saveCars() {
        Car car1 = new Car(1L, "Audi");
        Car car2 = new Car(2L, "BMW");
        Car car3 = new Car(3L, "Mersedes");

        return carRepository.saveAll(List.of(car1, car2, car3));
    }
}
