
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Калькулятор комплексных чисел");

        
        ComplexCalculator calculator = DecoratedComplexCalculatorFactory.createComplexCalculator(logger);

        // Здесь задаются два комплексных числа
        ComplexNumber num1 = new ComplexNumber(4, 7);
        ComplexNumber num2 = new ComplexNumber(6, 3);

        // Операции сложения, умножения и деления
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber division = calculator.divide(num1, num2);

        // Вывод результата
        System.out.println("Сложение: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Умножение: " + product.getReal() + " + " + product.getImaginary() + "i");
        System.out.println("Деление: " + division.getReal() + " + " + division.getImaginary() + "i");
    }
}