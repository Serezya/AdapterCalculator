package org.example;

public class App {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("Сумма: " + intsCalc.sum(2, 2));
        System.out.println("Разность: " + intsCalc.sub(33, 22));
        System.out.println("Умножение: " + intsCalc.mult(2, 22));
        System.out.println("Деление: " + intsCalc.div(10, 5));
        System.out.println("Возведение в степень: " + intsCalc.pow(10, 5));
    }
}
