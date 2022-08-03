package ru.koozma.FirstRestApp.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class ErrorUtils {
    public static void returnErrorsToClient(BindingResult bindingResult){
            StringBuilder errorMsg = new StringBuilder();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for(FieldError error: errors){
                errorMsg.append(error.getField()).append("-").append(error.getDefaultMessage()).append(";");
            }
            throw new MeasurementException(errorMsg.toString());
    }
}
