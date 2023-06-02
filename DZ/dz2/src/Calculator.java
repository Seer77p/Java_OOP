class Calculator extends AbstractCalculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        return num1 / num2;
    }

    public double power(double num, double exponent) {
        return Math.pow(num, exponent);
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public void displayMenu() {
        //  System.out.println("Выберете операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Возведение в степень");
        System.out.println("6. Извлечение корня");
        System.out.println("7. Выход");
    }
}