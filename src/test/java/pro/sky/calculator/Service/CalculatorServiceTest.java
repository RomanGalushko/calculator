package pro.sky.calculator.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.Service.Impl.CalculatorServiceImpl;

import static pro.sky.calculator.Constants.CalculatorServiceTestConstants.*;

class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectCalculationPlusResult() {
        String result = out.plus(num1, num2);
        Assertions.assertEquals(plusTest1, result);
        result = out.plus(num2, num2);
        Assertions.assertEquals(plusTest2, result);
    }

    @Test
    public void shouldReturnCorrectCalculationMinusResult() {
        String result = out.minus(num1, num1);
        Assertions.assertEquals(minusTest1, result);
        result = out.minus(num1, num2);
        Assertions.assertEquals(minusTest2, result);
    }

    @Test
    public void shouldReturnCorrectCalculationMultiplyResult() {
        String result = out.multiply(num1, num2);
        Assertions.assertEquals(multiplyTest1, result);
        result = out.multiply(num2, num2);
        Assertions.assertEquals(multiplyTest2, result);
    }

    @Test
    public void shouldReturnCorrectCalculationDivideResult() {
        String result = out.divide(num1, num1);
        Assertions.assertEquals(divideTest1, result);
        result = out.divide(num1, num2);
        Assertions.assertEquals(divideTest2, result);
    }

    @Test
    public void shouldThrowAnIllegalArgumentExceptionWhenDividingByZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.divide(num1, numZero)
        );
    }
}