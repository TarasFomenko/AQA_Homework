public class Homework3Task2 {
    public static void main(String[] args) {
        String results = ("Все простые чисеа в диапазоне от 20 до 100: ");
        System.out.print(results);
        int number = 20;
        while (number <= 100) {
            int count = 2;
            boolean balance = false;
            while (count <= number / 2) {
                if (number % count == 0) {
                    balance = true;
                    break;
                }
                count = count + 1;
            }
            if (!balance) {
                System.out.print(number + " ");
            }
            number = number + 1;
        }
    }
}
