package com.tobias.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, InvalidInputException.class})
    public ResponseEntity<ApiError> handleException(Exception exception) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ApiError apiError = new ApiError(status.value(), status.name(), "URL path variable 'n' must be an integer bigger than 0.");
        return new ResponseEntity<>(apiError, status);
    }
}
