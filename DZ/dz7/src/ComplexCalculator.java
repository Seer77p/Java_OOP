public class ComplexCalculator implements Calculator{
    private CalculatorLogger logger;

    public ComplexCalculator(CalculatorLogger logger) {
        this.logger = logger;
    }
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.add(number2);
        logger.logAddition(number1, number2, result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.multiply(number2);
        logger.logMultiplication(number1, number2, result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.divide(number2);
        logger.logDivision(number1, number2, result);
        return result;
    }
}
