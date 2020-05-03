public class Homework3Task4 {
    public static void main(String[] args) {
        int allLength = 1000;
        while (37 <= allLength) {
            System.out.println("Кусок Отрезан");
            allLength = allLength - 37;
        }
        System.out.println("Оставшаяся длина " + allLength);
    }
}