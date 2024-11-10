package com.example.Calculator;

public class CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>ОШИБКА!</b> Введены не все значения!";
        }
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>ОШИБКА!</b> Введены не все значения!";
        }
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>ОШИБКА!</b> Введены не все значения!";
        }
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<b>ОШИБКА!</b> Введены не все значения!";
        }
        if (num2 == 0) {
            return "<b>На ноль делить нельзя!</b>";
        }
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}
