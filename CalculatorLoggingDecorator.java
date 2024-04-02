import java.util.logging.Logger;

// Декоратор для логирования операций калькулятора.
// Классы ConcreteComplexCalculator и CalculatorLoggingDecorator отвечают за конкретную функциональность (выполнение математических операций и логирование соответственно), что соответствует принципу единственной обязанности.
// Также, декоратор CalculatorLoggingDecorator, расширяет функциональность основного калькулятора, но не изменяет его исходный код. 
// Такое разделение позволяет добавлять новые декораторы без изменения существующего кода ,чтобы соответствовать принципу открытости/закрытости.
// При этом, принцип подстановки Барбары Лисков в данном коде соблюдается неявно, так как декоратор CalculatorLoggingDecorator может заменять базовый калькулятор ComplexCalculator без изменения поведения остальной программы.

class CalculatorLoggingDecorator implements ComplexCalculator {
    private ComplexCalculator calculator;
    private Logger logger;

    public CalculatorLoggingDecorator(ComplexCalculator calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполнение сложения");
        return calculator.add(a, b);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполнение умножения");
        return calculator.multiply(a, b);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполнение деления");
        return calculator.divide(a, b);
    }
}