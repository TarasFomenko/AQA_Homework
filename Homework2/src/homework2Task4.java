public class homework2Task4 {
    public static void main(String[] args) {
        String results = "Какие числа от 10 до 50 делятся на 7 без остатка: ";
        System.out.print(results);
        int module;
        for (int cycle = 10; cycle <= 50; cycle = cycle + 1) {
            module = cycle % 7;
            if (module == 0) {
                System.out.print(cycle + " ");
            }
        }
    }
}