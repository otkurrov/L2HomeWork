public class Honda extends Car{
    public Honda(String name, int tiresRadius) {
        super(name, tiresRadius);
    }

    @Override
    public void print() {
        System.out.println("Ⓗ" + " " + getName() + " Tires radius: " + getTiresRadius());
    }
}
