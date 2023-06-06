import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Menu menu = new Menu();
            double num1 = 0;
            double num2 = 0;
            double num = 0;
            double exponent = 0;
            Calculator calculator = new Calculator(num1, num2);

            int choice = 0;
            double result = 0;

            while (choice != 7) {
                calculator.displayMenu();
                choice = menu.getChoice();

                switch (choice) {
                    case 1:
                        num1= menu.getNum1();
                        num2= menu.getNum2();
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        num1= menu.getNum1();
                        num2= menu.getNum2();
                        result = calculator.subtract(num1, num2);
                        break;
                    case 3:
                        num1= menu.getNum1();
                        num2= menu.getNum2();
                        result = calculator.multiply(num1, num2);
                        break;
                    case 4:
                        num1= menu.getNum1();
                        num2= menu.getNum2();
                        result = calculator.divide(num1, num2);
                        break;
                    case 5:
                        num = menu.getNum();
                        exponent = menu.getExponent();
                        result = calculator.power(num, exponent);
                        break;
                    case 6:
                        num = menu.getNum();
                        result = calculator.squareRoot(num);
                        break;
                    case 7:
                        System.out.println("Выход из калькулятора...");
                        break;
                    default:
                        System.out.println("Не правильный выбор");
                }

                if (choice != 7) {
                    System.out.println("Результат: " + result);
                }
            }
    }
}