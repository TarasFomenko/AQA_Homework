import javax.xml.transform.sax.SAXSource;

public class homework2Task2 {
    public static void main(String[] args) {
        String results = "Результаты счётчика: ";
        System.out.print(results);
        for (int cycle = -100; cycle <= 100; cycle = cycle + 10){
            System.out.print(cycle + " ");
        }
    }
}
