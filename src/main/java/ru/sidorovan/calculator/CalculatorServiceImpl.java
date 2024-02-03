package ru.sidorovan.calculator;

import org.springframework.stereotype.Service;
import ru.sidorovan.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float divide(int num1, int num2) {
        return num1 / num2;
    }
}
