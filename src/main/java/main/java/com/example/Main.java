package main.java.com.example;

import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите первое и второе число через пробел: ");

        try {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.print("выберите действие (+, -, *, /, %) - ");
            char op = sc.next().charAt(0);

            int result = 0;
            switch (op) {
                case '+':
                    result = calculator.add(a, b);
                    break;
                case '-':
                    result = calculator.subtract(a, b);
                    break;
                case '*':
                    result = calculator.multiply(a, b);
                    break;
                case '/':
                    result = calculator.divide(a, b);
                    break;
                case '%':
                    result = calculator.modulus(a, b);
                    break;
                default:
                    System.out.println("Неизвестная операция");
                    System.exit(1);
            }

            System.out.println("Ответ " + result);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}