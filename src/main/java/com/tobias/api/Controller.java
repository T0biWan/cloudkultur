package com.tobias.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("helloapi/fibonacci/{n}")
    public Resource resource(@PathVariable int n) throws InvalidInputException {
        if (InputProcessor.inputIsValid(n)) {
            int output = InputProcessor.calculateFibonacci(n) ? InputProcessor.fibonacci(n) : 100;
            return new Resource(n, output);
        } else {
            throw new InvalidInputException();
        }
    }
}
