import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        HotBeverageMashine dr = new HotBeverageMashine();
        Product hotTea = new hotBeverage("hotTea", 200, 90);
        Product hotCoffee = new hotBeverage("hotCoffee", 300, 80);
        Product hotChocolate = new hotBeverage("hotChocolate", 150, 60);

        ArrayList<Product> hot = new ArrayList<>();
        hot.add(hotTea);
        hot.add(hotChocolate);
        hot.add(hotCoffee);
        hot.add(hotTea);
        hot.add(hotTea);
        hot.add(hotTea);

        dr.putProduct(hot);
        dr.getProduct();
        dr.getProduct();
        dr.getProduct();
        dr.getProduct();
      //  System.out.println("1"+dr.getProduct());
//        System.out.println("555"+dr.getProduct());
//        System.out.println(dr.getProduct());
//        System.out.println(dr.getProduct());
    }
}