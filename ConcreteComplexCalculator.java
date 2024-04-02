import java.util.logging.Logger;

// Реализация калькулятора для комплексных чисел
class ConcreteComplexCalculator implements ComplexCalculator {
    private Logger logger;

    public ConcreteComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ConcreteComplexCalculator(double i, double j) {
        
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() + b.getReal();
        double imaginaryResult = a.getImaginary() + b.getImaginary();
        logger.info("Операция сложения: " + a.getReal() + " + " + b.getReal() + " + " + a.getImaginary() + "i + " + b.getImaginary() + "i = " + realResult + " + " + imaginaryResult + "i");
        return new ComplexNumber(realResult, imaginaryResult);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryResult = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        logger.info("Операция умножения: " + a.getReal() + " * " + b.getReal() + " - " + a.getImaginary() + " * " + b.getImaginary() + "i = " + realResult + " + " + imaginaryResult + "i");
        return new ComplexNumber(realResult, imaginaryResult);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realResult = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryResult = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        logger.info("Операция деления: (" + a.getReal() + " + " + a.getImaginary() + "i) / (" + b.getReal() + " + " + b.getImaginary() + "i) = (" + realResult + " + " + imaginaryResult + "i");
        return new ComplexNumber(realResult, imaginaryResult);
    }
}