package org.owpk.validating;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.DataBinder;

public class BeanWrapperExample {

    public MockPerson setProperty() {
        var wrapper = new BeanWrapperImpl(new MockPerson());
        var prop = new PropertyValue("name", "Viktor");
        wrapper.setPropertyValue(prop);
        wrapper.setPropertyValue("email", "vik@email.ru");
        return (MockPerson) wrapper.getWrappedInstance();
    }

    public static void main(String[] args) {
//        System.out.println(new BeanWrapperExample().setProperty());
        var mockPerson = new MockPerson("", "invalid email");
        var dataBinder = new DataBinder(mockPerson);
        dataBinder.setValidator(new PersonValidator());
        dataBinder.bind(new MutablePropertyValues());
        dataBinder.validate();
        var result = dataBinder.getBindingResult();
        result.getAllErrors().forEach(System.out::println);
    }
}
