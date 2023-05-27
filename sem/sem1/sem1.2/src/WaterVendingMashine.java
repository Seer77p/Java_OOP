import java.util.LinkedList;

public class WaterVendingMashine implements VendingMashine{
    private LinkedList<Product> waters;
    public void putProduct(LinkedList<Product> item){
        this.waters = item;
    }
    public  Product getProduct(){
        return waters.pollLast();
    }
}
