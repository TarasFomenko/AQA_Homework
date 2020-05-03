public class homework1Task2 {
    public static void main(String[] args) {
        int number1 = 21;
        int number2 = 36;
        boolean lastDigitIsTheSame = number1 % 5 == number2 % 5;
        System.out.println("Одинаковы ли последние цифры:");
        System.out.println(lastDigitIsTheSame);
    }
}
