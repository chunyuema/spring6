package com.chunyue.spring6.beanvalidator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class NativeValidator {

    @Autowired
    private Validator validator;

    public boolean validatePerson(Person person) {
        Set<ConstraintViolation<Person>> validate = validator.validate(person);
        return validate.isEmpty();
    }

}
