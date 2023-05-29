import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import static java.awt.SystemColor.menu;

public class HotBeverageMashine implements VendingMashine {
    private ArrayList<Product> drink;

    public void putProduct(ArrayList<Product> drink) {
        this.drink = drink;
    }

    public ArrayList<Product> getProduct() {
        int valMenu=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Выбирете напиток: \n"+"Горячий чай: 1\n"+
                "Горячий кофе: 2\n"+"Горячий шоколад: 3\n");
        valMenu= scan.nextInt();
        Iterator<Product> productIterator = drink.iterator();
        int count=0;
        while (productIterator.hasNext()){
          Product nextProduct = productIterator.next();
          if(nextProduct.id == valMenu){
              System.out.println("Наливаю "+nextProduct.name);
              productIterator.remove();
              return drink;
          }else {
              count++;
          }
        }
        if(count != 0){
            System.out.println("Такого напитка нет!");
        }

        return drink;
    }
}
