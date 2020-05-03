public class homework2Task7 {
    public static void main(String[] args) {
        String table = "Таблица Умножения:";
        for (int cycle = 1; cycle <= 10; cycle = cycle + 1) {
            for (int row = 1; row <= 10; row = row +1){
                System.out.print(row * cycle + "\t");
            }
            System.out.println();
        }
    }
}

