package com.chunyue.spring6.aop.xmlaop;

import org.springframework.stereotype.Component;

@Component
public class AnimalControllerImpl implements AnimalController {
    @Override
    public String addAnimal() {
        System.out.println("Adding animal to the database");
        return "200 OK";
    }

    @Override
    public String getAnimal() {
        System.out.println("Getting animal from the database");
        return "200 OK";
    }

    @Override
    public Exception getAnimalWithException() {
        System.out.println("Getting animal from the database");
        return new Exception("Resource not found");
    }
}
