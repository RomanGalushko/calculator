package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    static int result;
    public String welcome() {
        return "<b><h1>Добро пожаловать в калькулятор.</h1></b>";
    }
    public String plus(int num1, int num2){
        result = num1 + num2;
        return "Сложение: " + num1 + " + " + num2 + " = " + result;
    }
    public String minus(int num1, int num2){
        result = num1 - num2;
        return "Вычетание: " + num1 + " - " + num2 + " = " + result;
    }
    public String multiply(int num1, int num2){
        result = num1 * num2;
        return "Умножение: " + num1 + " * " + num2 + " = " + result;
    }
    public String divide(int num1, int num2){
        if (num2 == 0) {
            return "<h1>Делить на 0 не льзя!!!</h1>";
        }
        result = num1/num2;
        return "Деление: " + num1 + " : " + num2 + " = " + result;
    }
}
