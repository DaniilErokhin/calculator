

import java.util.Scanner;

public class Calculator {
    public int operand1;
    public int operand2;
    public char operation;

    public Calculator() {
        this.readData();
        this.switchOperation(operation);
    }

    public void readData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое и второе число через пробел: ");

        try {
            operand1 = Integer.parseInt(sc.next());
            operand2 = Integer.parseInt(sc.next());
            System.out.print("выберите действие (+, -, *, /, %) - ");
            operation = sc.next().charAt(0);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public void switchOperation(char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = this.add(operand1, operand2);
                break;
            case '-':
                result = this.subtract(operand1, operand2);
                break;
            case '*':
                result = this.multiply(operand1, operand2);
                break;
            case '/':
                result = this.divide(operand1, operand2);
                break;
            case '%':
                result = this.modulus(operand1, operand2);
                break;
            default:
                System.out.println("Неизвестная операция");
                System.exit(1);
        }

        System.out.println("Ответ " + result);
    }

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
