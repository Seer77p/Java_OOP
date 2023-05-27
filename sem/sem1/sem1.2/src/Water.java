public class Water extends Product{
    @Override
    public String getName() {
        return super.name;
    }
    public Water(String name, int price){
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }
}
