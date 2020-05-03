import java.util.Scanner;

public class Debug1 {
    public static void main(String[] args) {
        System.out.println("\nПример кода 1. Все квадраты натуральных чисел меньше n!"); //Код печатает 1 в бесконечном цикле
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, пожалуйста:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            int natNum = 1;
            System.out.println("Квадраты натуральных чисел, которые меньше " + n + ": ");
            while (natNum <= n) {
                int squareNatNum = (int) Math.pow(natNum, 2);// Чтобы не было лупа, нужно перенести переменную внутрь цикла
                System.out.print(squareNatNum + " ");
                natNum++;
            }
        }
    }
}

/*
Как было до этого. Я поставил точку на строке 13.
    System.out.println("\nПример кода 1. Все квадраты натуральных чисел меньше n!"); //Код печатает 1 в бесконечном цикле
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число, пожалуйста:");
    if (sc.hasNextInt()) {
        int n = sc.nextInt();
        int natNum = 1;
        System.out.println("Квадраты натуральных чисел, которые меньше " + n + ": ");
        int squareNatNum = (int) Math.pow(natNum, 2);
        while (natNum <= n) {
            System.out.print(squareNatNum + " ");
            natNum++;
}
}
}
}
*/




