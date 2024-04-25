package com.sky.anno;

import com.sky.validation.SexValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {SexValidation.class}
)

public @interface Sex {
    String message() default "性别只能是男或女";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
