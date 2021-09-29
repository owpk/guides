package controller;

import persist.ToDoCategory;
import persist.ToDoCategoryRepository;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class ToDoCategoryConverter implements Converter<ToDoCategory> {

    @Inject
    private ToDoCategoryRepository toDoCategoryRepository;

    @Override
    public ToDoCategory getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }

        try {
            return toDoCategoryRepository.findById(Long.parseLong(submittedValue));
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid Category Id", submittedValue)), e);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, ToDoCategory value) {
        if (value == null) {
            return "";
        }
        return String.valueOf(value.getId());
    }

}
