package pro.sky.calculator.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.Service.Impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.calculator.Constants.CalculatorServiceTestConstants.*;

class CalculatorServiceParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusResultTest")
    public void shouldReturnCorrectCalculationPlusResult(int num1, int num2, String expectedResult) {
        String result = out.plus(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusResultTest")
    public void shouldReturnCorrectCalculationMinusResult(int num1, int num2, String expectedResult) {
        String result = out.minus(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyResultTest")
    public void shouldReturnCorrectCalculationMultiplyResult(int num1, int num2, String expectedResult) {
        String result = out.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideResultTest")
    public void shouldReturnCorrectCalculationDivideResult(int num1, int num2, String expectedResult) {
        String result = out.divide(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForPlusResultTest() {
        return Stream.of(
                Arguments.of(num1, num2, plusTest1),
                Arguments.of(num2, num2, plusTest2)
        );
    }

    public static Stream<Arguments> provideParamsForMinusResultTest() {
        return Stream.of(
                Arguments.of(num1, num1, minusTest1),
                Arguments.of(num1, num2, minusTest2)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyResultTest() {
        return Stream.of(
                Arguments.of(num1, num2, multiplyTest1),
                Arguments.of(num2, num2, multiplyTest2)
        );
    }

    public static Stream<Arguments> provideParamsForDivideResultTest() {
        return Stream.of(
                Arguments.of(num1, num1, divideTest1),
                Arguments.of(num1, num2, divideTest2)
        );
    }
}