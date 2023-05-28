import java.util.ArrayList;
import java.util.Iterator;

public class HotBeverageMashine implements VendingMashine {
    private ArrayList<Product> drink;

    public void putProduct(ArrayList<Product> drink) {
        this.drink = drink;
    }

    public ArrayList<Product> getProduct() {
        Iterator<Product> productIterator = drink.iterator();
        //System.out.println(drink+"1");
        int count=0;
        while (productIterator.hasNext()){
          Product nextProduct = productIterator.next();
          if(nextProduct.name.equals("hotTea")){
              System.out.println("Наливаю "+nextProduct.name);
              productIterator.remove();
              return drink;
          }else {
              count++;
          }
        }
        if(count != 0){
            System.out.println("Такого напитка нет"+count);
        }
        return drink;
    }
}
