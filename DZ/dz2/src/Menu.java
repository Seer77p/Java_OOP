import java.util.Scanner;

class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int getChoice() {
        System.out.print("Выберете действие: ");
        return scanner.nextInt();
    }

    public double getNum1() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    public double getNum2() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    public double getNum() {
        System.out.print("Введите возводимое число: ");
        return scanner.nextDouble();
    }

    public double getExponent() {
        System.out.print("Введите степень: ");
        return scanner.nextDouble();
    }
}

