import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WaterVendingMashine wvm = new WaterVendingMashine();
        Product bonAqua = new Water("bonAqua", 50);
        Product redKey = new Water("redKey", 60);
        Product fanta = new Water("fanta", 100);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        l.add(fanta);

        wvm.putProduct(l);

        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
    }
}