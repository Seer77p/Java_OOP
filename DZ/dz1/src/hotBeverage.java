public class hotBeverage extends Product{
    protected int temperature;

    public hotBeverage(String name, int volume, int temperature) {
        this.temperature = temperature;
        super.name = name;
        super.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }
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

    @Override
    public void setName() {
        super.name = name;
    }

    @Override
    public void setVolume() {
        super.volume = volume;
    }

    @Override
    public String toString() {
        return "hotBeverage{" +
                "name = '" + name +
                ", volume = " + volume +"mg"+
                ", temperature = " + temperature +"gr"+'\''+
                '}';
    }
}
