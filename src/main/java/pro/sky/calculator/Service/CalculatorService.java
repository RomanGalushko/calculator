package pro.sky.calculator.Service;

public interface CalculatorService {
    String welcome();

    String plus(int num1, int num2);

    String minus(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);
}