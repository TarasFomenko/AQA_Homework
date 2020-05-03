public class homework2Task5 {
    public static void main(String[] args) {
        String results = "Какие числа от 10 до 99 делятся на 4 без остатка, но не делятся на 6: ";
        System.out.print(results);
        for (int cycle = 10; cycle <= 99; cycle = cycle +1){
            if (cycle%4 == 0 && cycle%6 != 0){
                System.out.print(cycle + " ");
            }
        }
    }
}

