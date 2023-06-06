
//
public class hotBeverage extends Product implements Comparable<Product>{
    protected int temperature;

    public hotBeverage(int id, String name, int volume, int temperature, int price) {
        this.temperature = temperature;
        super.price = price;
        super.id = id;
        super.name = name;
        super.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }
    public int getPrice() {return 0; }
    public int getId(){return 0;}
    public String getName(){
        return super.name;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPrice() {this.price = price;}

    @Override
    public void setName() {
        super.name = name;
    }

    @Override
    public void setVolume() {
        super.volume = volume;
    }

    @Override
    public void setId() {super.id = id; }

    @Override
    public String toString() {
        return "id: "+id+
                " - Тип напитка: '" + name +
                ", объем = " + volume +"мг."+
                ", температура = " + temperature +"гр."+
                "цена = "+ price+"\n"+'\'';
    }

    @Override
    public int compareTo(Product o) {
        //return Integer.compare(this.price, o.price);
        if(this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;
    }

}
