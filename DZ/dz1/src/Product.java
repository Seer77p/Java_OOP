//
public abstract class Product implements Comparable<Product>{
    protected int id;
    protected String name;
    protected int volume;
    protected int price;

    public abstract int getId();
    public abstract void setId();

    public abstract String getName();
    public abstract void setName();

    public abstract int getVolume();
    public abstract void setVolume();

    public abstract int getPrice();

    public abstract void setPrice();
}
