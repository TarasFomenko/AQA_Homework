public class CalculatorLogic {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static double divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        if (number1 == 0)
            throw new ArithmeticException("Нельзя ноль поделить на что-то!");
        else {
            return (double) number1 / number2;
        }
    }
}