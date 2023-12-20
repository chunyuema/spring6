package com.chunyue.spring6.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // validate if name is not null
        ValidationUtils.rejectIfEmpty(errors, "name",
                "InvalidParameterException",
                "Name cannot be null");

        // validate age is in range 0 - 200
        Person person = (Person) target;
        if (person.getAge() < 0 || person.getAge() > 200) {
            errors.rejectValue("age", "InvalidParameterException",
                    "Age must be in range 0 - 200");
        }
    }
}
