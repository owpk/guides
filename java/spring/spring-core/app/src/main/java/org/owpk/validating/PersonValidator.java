package org.owpk.validating;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return MockPerson.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        MockPerson person = (MockPerson) target;
        if (!person.getEmail().matches(".+@\\.com")) {
            errors.rejectValue("email", "wrong email");
        }
    }
}