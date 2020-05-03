public class Homework3Task3 {
    public static void main(String[] args) {
        String results = ("Все точные квадраты натуральных чисел, не превосходящие числа number: ");
        System.out.print(results);
        int n = 1;
        int number = 200;
        while (Math.pow(n, 2) < number) {
            System.out.print(Math.pow(n, 2) + " ");
            n++;
        }
    }
}
