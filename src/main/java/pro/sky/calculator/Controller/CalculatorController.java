package pro.sky.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomeToCalculator() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1,num2);
    }
}