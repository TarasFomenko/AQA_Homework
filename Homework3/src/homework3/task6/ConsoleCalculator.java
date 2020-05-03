package homework3.task6;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        String operation = "В ожидании";

        System.out.println("Введите число 1");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        }
        System.out.println("Введите число 2");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        }
        System.out.println("Введите операцию");
        if (scanner.hasNext()) {
            operation = scanner.next();
        }
        switch (operation) {
            case "+":
                System.out.println(CalculatorLogic.add(number1, number2));
                break;
            case "-":
                System.out.println(CalculatorLogic.subtract(number1, number2));
                break;
            case "*":
                System.out.println(CalculatorLogic.multiply(number1, number2));
                break;
            case "/":
                System.out.println(CalculatorLogic.divide(number1, number2));
                break;
            default:
                System.out.println("Знак введён неправильно");
        }
    }
}

