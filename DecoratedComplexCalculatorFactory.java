import java.util.logging.Logger;


// В фабрике DecoratedComplexCalculatorFactory используется принцип инверсии зависимостей. 
// Она создает декоратор CalculatorLoggingDecorator, который зависит от абстракции ComplexCalculator, а не от конкретной реализации калькулятора. 
// Принцип инверсии зависимостей.

class DecoratedComplexCalculatorFactory {
    public static ComplexCalculator createComplexCalculator(Logger logger) {
        ComplexCalculator calculator = new ConcreteComplexCalculator(logger);
        return new CalculatorLoggingDecorator(calculator, logger);
    }
}