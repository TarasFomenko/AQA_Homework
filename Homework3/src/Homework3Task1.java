public class Homework3Task1 {
    public static void main(String[] args) {
        String results = ("Сумма всех нечётных чисел в диапазоне от 1 до 20: ");
        System.out.print(results);
        int number = 1;
        int sum = 0;
        while (number <= 20) {
            if (number % 2 != 0) {
                sum = sum + number;
            }
            number = number + 1;
        }
        System.out.print(sum);
    }
}

