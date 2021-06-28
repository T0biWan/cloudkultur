package com.tobias.api;

public class InputProcessor {
    public static boolean inputIsValid(int input) {
        return input > 0;
    }

    public static int fibonacci(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean calculateFibonacci(int input) {
        return input < 12;
    }
}
