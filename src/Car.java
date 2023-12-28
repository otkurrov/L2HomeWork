public class Car implements Printable{
    String name;
    int tiresRadius;

    public int getTiresRadius() {
        return tiresRadius;
    }

    public Car(String name, int tiresRadius) {
        this.name = name;
        this.tiresRadius=tiresRadius;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {

    }
}
