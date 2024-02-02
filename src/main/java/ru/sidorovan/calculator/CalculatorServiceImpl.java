package ru.sidorovan.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в <b>калькулятор</b>!" +
                "<p>Доступные страницы:</p>" +
                "<p>1) <a href=\"http://localhost:8080/calculator\">http://localhost:8080/calculator</p>" +
                "<p>2) <a href=\"http://localhost:8080/calculator/plus?num1=5&num2=5\">http://localhost:8080/calculator/plus?num1=5&num2=5</p>" +
                "<p>3) <a href=\"http://localhost:8080/calculator/minus?num1=5&num2=5\">http://localhost:8080/calculator/minus?num1=5&num2=5</p>" +
                "<p>4) <a href=\"http://localhost:8080/calculator/multiply?num1=5&num2=5\">http://localhost:8080/calculator/multiply?num1=5&num2=5</p>" +
                "<p>4) <a href=\"http://localhost:8080/calculator/divide?num1=5&num2=5\">http://localhost:8080/calculator/divide?num1=5&num2=5</p>";
    }
    public String plus(int num1, int num2){
       return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    public String minus(int num1, int num2){
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String multiply(int num1, int num2){
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public String divide(int num1, int num2){
        String result;
        if (num2 == 0){
            result = "<p style=\"color: red\"> Ошибка! " + num1 + " / " + num2 + "! Деление на 0 запрещено!</p>";
        }
        else result = num1 + " / " + num2 + " = " + (float) (num1 / num2);

        return result;
    }
}
