public class hotBeverage extends Product{
    protected int temperature;

    public hotBeverage(int id, String name, int volume, int temperature) {
        this.temperature = temperature;
        super.id = id;
        super.name = name;
        super.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }
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
                ", температура = " + temperature +"гр."+"\n"+'\'';
    }
}
