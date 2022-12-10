package org.example.boot.controller;

import org.example.boot.bean.Car;
import org.example.boot.bean.Car1;
import org.example.boot.bean.Car2Lombok;
import org.example.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Car1 car1;
    @Autowired
    private Car car;

    @Autowired
    private Car2Lombok car2Lombok;

    @Autowired
    private Person person;

        @RequestMapping("/person")
    public Person person() {
        return person;
    }

    @RequestMapping("/car2")
    public Car2Lombok car2Lombok() {
        return car2Lombok;
    }

    @RequestMapping("/car1")
    public Car1 car1() {
        return car1;
    }

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello,Spring Boot2!";
    }


}
