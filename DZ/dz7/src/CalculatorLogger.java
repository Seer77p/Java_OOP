public class CalculatorLogger {
    private static CalculatorLogger instance;
    private CalculatorLogger(){}

    public static CalculatorLogger getInstance() {
        if(instance == null){
            instance = new CalculatorLogger();
        }
        return instance;
    }
    public void logAddition(ComplexNumber number1, ComplexNumber number2, ComplexNumber result){
        System.out.println("Сложение: \n"+"первое число: "+number1+" + "+"второе число: "+number2+"\nСумма: "+result+"\n");
    }



    public void logMultiplication(ComplexNumber number1, ComplexNumber number2, ComplexNumber result) {
        System.out.println("Умножение: \n"+"первое число: "+ number1 + " * "+"второе число: " + number2 + "\nПроизведение: " + result+"\n");
    }
    public void logDivision(ComplexNumber number1, ComplexNumber number2, ComplexNumber result) {
        System.out.println("Деление: " +"первое число: "+ number1 + " / " +"второе число: "+ number2 + "\nЧастное: " + result+"\n");
    }
}
