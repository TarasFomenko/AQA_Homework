public class homework2Task1 {
    public static void main(String[] args) {
        String dayName = "Понедельник";
        switch (dayName) {
            case "Понедельник":
                System.out.println("Сегодня первый (1) день недели");
                break;
            case "Вторник":
                System.out.println("Сегодня второй (2) день недели");
                break;
            case "Среда":
                System.out.println("Сегодня третий (3) день недели");
                break;
            case "Четверг":
                System.out.println("Сегодня четвёртый (4) день недели");
                break;
            case "Пятница":
                System.out.println("Сегодня пятый (5) день недели");
                break;
            case "Суббота":
                System.out.println("Сегодня шестой (6) день недели");
                break;
            case "Воскресенье":
                System.out.println("Сегодня седьмой (7) день недели");
                break;
            default:
                System.out.println("Дни недели закончились");
        }
    }
}
