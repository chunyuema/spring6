package com.chunyue.spring6.methodvalidator;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class MethodValidator {

    public void validatePerson(@NotNull @Valid Person person) {
        System.out.println(person + " is validated!");
    }
}
