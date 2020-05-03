public class homework1Task3 {
    public static void main(String[] args) {

        boolean weekday = true;
        boolean vacation = true;
        boolean weStayAtHome = vacation || !weekday;
        System.out.println ("Остаёмся ли мы дома если сейчас день недели и мы в отпуске:");
        System.out.println (weStayAtHome);

        weekday = false;
        vacation = true;
        weStayAtHome = vacation || !weekday;
        System.out.println ("Остаёмся ли мы дома:");
        System.out.println (weStayAtHome);

        weekday = true;
        vacation = false;
        weStayAtHome = vacation || !weekday;
        System.out.println ("Остаёмся ли мы дома:");
        System.out.println (weStayAtHome);

        weekday = false;
        vacation = false;
        weStayAtHome = vacation || !weekday;
        System.out.println ("Остаёмся ли мы дома:");
        System.out.println (weStayAtHome);
    }
}
