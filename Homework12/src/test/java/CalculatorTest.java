import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test (priority = 1)
    public void additionLogicTest(){
        int number1 = 5;
        int number2 = 7;
        int calculatorAdditionResult = CalculatorLogic.add(number1, number2);
        Assert.assertEquals(calculatorAdditionResult, 12);
    }

    @Test (priority = 2)
    public void subtractLogicTest(){
        int number1 = 5;
        int number2 = 7;
        int calculatorSubtractResult = CalculatorLogic.subtract(number1, number2);
        Assert.assertEquals(calculatorSubtractResult, -2);
    }

    @Test (priority = 3)
    public void multiplyLogicTest(){
        int number1 = 5;
        int number2 = 7;
        int calculatorMultiplyResult = CalculatorLogic.multiply(number1, number2);
        Assert.assertEquals(calculatorMultiplyResult, 35);
    }

    @Test (priority = 4)
    public void divideLogicTest(){
        int number1 = 70;
        int number2 = 7;
        double calculatorDivideResult = CalculatorLogic.divide(number1, number2);
        Assert.assertEquals(calculatorDivideResult, 10);
    }

    @Test (priority = 5, expectedExceptions = java.lang.ArithmeticException.class)
    public void divideOnZeroExceptionTest (){
        int number1 = 70;
        int number2 = 0;
        System.out.println(CalculatorLogic.divide(number1, number2));
    }

}
