import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotBeverageMashine dr = new HotBeverageMashine();
        Product hotTea = new hotBeverage(1,"Горячий чай", 200, 90);
        Product hotCoffee = new hotBeverage(2,"Горячий кофе", 300, 80);
        Product hotChocolate = new hotBeverage(3,"Горячий шоколад", 150, 60);

        ArrayList<Product> hot = new ArrayList<>();
        hot.add(hotTea);
        hot.add(hotChocolate);
        hot.add(hotCoffee);
        hot.add(hotTea);
        hot.add(hotTea);
        hot.add(hotTea);

        dr.putProduct(hot);
        System.out.println("Осталось:\n"+dr.getProduct());
        System.out.println("Осталось:\n"+dr.getProduct());
        System.out.println("Осталось:\n"+dr.getProduct());
        System.out.println("Осталось:\n"+dr.getProduct());

    }
}