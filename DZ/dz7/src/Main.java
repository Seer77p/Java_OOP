public class Main {
    public static void main(String[] args) {

        CalculatorLogger logger = CalculatorLogger.getInstance();
        Calculator calculator = new ComplexCalculator(logger);

        ComplexNumber number1 = new Complex(2,3);
        ComplexNumber number2 = new Complex(4,5);

        ComplexNumber additionResult = calculator.add(number1, number2);
        //System.out.println(additionResult+"\n");
        ComplexNumber multiplicationResult = calculator.multiply(number1, number2);
       // System.out.println(multiplicationResult+"\n");
        ComplexNumber divisionResult = calculator.divide(number1, number2);
       // System.out.println(divisionResult+"\n");
    }
}