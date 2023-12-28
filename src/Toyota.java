public class Toyota extends Car{
    public Toyota(String name, int tiresRadius) {
        super(name, tiresRadius);
    }

    @Override
    public void print() {
        System.out.println("\uD83C\uDFCE" + " " + getName() + " Tires radius: " + getTiresRadius());
    }
}
