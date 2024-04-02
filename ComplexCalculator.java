
// Интерфейс калькулятора ComplexCalculator содержит только методы для выполнения операций с комплексными числами, что соответствует принципу разделения интерфейса.

interface ComplexCalculator {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}
