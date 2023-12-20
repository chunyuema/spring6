package com.chunyue.spring6.beanvalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

@Component
public class SpringValidator  {

    @Autowired
    private Validator validator;


    public boolean validatePerson(Person person) {
        BindException bindException = new BindException(person, person.getName());
        validator.validate(person, bindException);
        return bindException.hasErrors();
    }
}
