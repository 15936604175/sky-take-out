package com.sky.validation;

import com.sky.anno.Sex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SexValidation implements ConstraintValidator<Sex, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) {
            return false;
        }
        if (s.equals("1") || s.equals("0")) {
            return true;
        }
        return false;
    }
}
