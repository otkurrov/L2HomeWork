public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", 20);

        Honda honda = new Honda("Honda", 15);

        Toyota toyota = new Toyota("Toyota", 16);

        Printable[] printables = {bmw, honda, toyota};

        Car[] cars = {bmw, toyota, honda};

        for (int i = 0; i < printables.length; i++) {

            //System.out.println(cars[i].getName() + " Tires radius: " + cars[i].getTiresRadius());

            printables[i].print();

        }
        for (Printable printable : printables) {
            printable.print();
        }
    }
    public static Car createObject(String className, String name, int tiresRadius) {
        switch (className) {
            case "2й":
                return new BMW(name, tiresRadius);
            case "3й":
                return new Honda(name, tiresRadius);
            case "4й":
                return new Toyota(name, tiresRadius);
            default:
                throw new IllegalArgumentException("Недопустимый тип класса: " + className);
        }
    }

}