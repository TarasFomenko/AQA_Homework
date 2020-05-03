public class homework2Task6 {
    public static void main(String[] args) {
        String results = "Сумма чисел от 100 до 200, кратных 17: ";
        System.out.print(results);
        int sum = 0;
        for (int cycle = 100; cycle <=200; cycle = cycle +1){
            if (cycle%17 == 0){
                sum = cycle + sum;
            }
        }
        System.out.print(sum + " ");
    }
}
