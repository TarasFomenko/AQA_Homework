package homework3.task5;

import java.util.Scanner;

public class homework3Task5Compare2NumbersFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = 0;
        int b = 0;
        System.out.println("Введите первое число");
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        System.out.println("Введите первое число");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        System.out.println("Большее число: " + CompareMethod.compare(a, b));
    }
}
