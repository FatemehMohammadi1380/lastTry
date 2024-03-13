package com.example.lastTry.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/calc/{operator}/{op1}/{op2}")
    public String calculate(@PathVariable String operator, @PathVariable double op1, @PathVariable double op2) {
        switch (operator) {
            case "sum":
                return op1 + " + " + op2 + " = " + (op1 + op2);
            case "subtract":
                return op1 + " - " + op2 + " = " + (op1 - op2);
            case "mult":
                return op1 + " * " + op2 + " = " + (op1 * op2);
            case "div":
                if (op2 == 0) return "Error: Division by zero";
                return op1 + " / " + op2 + " = " + (op1 / op2);
            default:
                return "Invalid operation";
        }
    }
}
