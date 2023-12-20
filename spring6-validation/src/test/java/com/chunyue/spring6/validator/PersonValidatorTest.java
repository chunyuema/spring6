package com.chunyue.spring6.validator;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class PersonValidatorTest {

    @Test
    public void testNullName() {
        Person person = new Person();
        DataBinder binder = new DataBinder(person);
        binder.setValidator(new PersonValidator());
        binder.validate();
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }

    @Test
    public void testInvalidAge() {
        Person person = new Person();
        person.setName("chunyue");
        person.setAge(10000);
        DataBinder binder = new DataBinder(person);
        binder.setValidator(new PersonValidator());
        binder.validate();
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());
    }
}
