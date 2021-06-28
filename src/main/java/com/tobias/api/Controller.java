package com.tobias.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestController
public class Controller {
    @GetMapping("helloapi/fibonacci/{n}")
    public Resource resource(@PathVariable int n) throws InvalidInputException {
        if (InputProcessor.inputIsValid(n)) {
            int output = InputProcessor.fibonacci(n);
            return new Resource(n, output);
        } else {
            throw new InvalidInputException();
        }
    }
}
