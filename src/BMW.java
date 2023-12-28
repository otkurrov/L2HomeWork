public class BMW extends Car{
    public BMW(String name, int tiresRadius) {
        super(name, tiresRadius);
    }

    @Override
    public void print() {
        System.out.println("\uD83D\uDE97" + " " + getName() + " Tires radius: " + getTiresRadius());
    }
}
