public abstract class Product {
    protected int id;
    protected String name;
    protected int volume;

    public abstract int getId();
    public abstract void setId();

    public abstract String getName();
    public abstract void setName();

    public abstract int getVolume();
    public abstract void setVolume();
}
