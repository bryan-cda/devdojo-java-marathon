package br.com.java.marathon.oo;

import br.com.java.marathon.oo.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1,1));
        System.out.println(calc.subtraction(1,1));
        System.out.println(calc.multiply(2,2));
        System.out.println(calc.division(10,2));
    }
}