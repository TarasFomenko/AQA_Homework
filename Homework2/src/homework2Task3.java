public class homework2Task3 {
    public static void main(String[] args) {
        String results = "Квадраты чисел от 10 до 20: ";
        System.out.print(results);
        for(int cycle = 10; cycle <= 20; cycle = cycle +1){
            int quadro;
            quadro = cycle * cycle;
            System.out.print(quadro + " ");
        }
    }
}
