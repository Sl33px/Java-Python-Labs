package ua.lviv.iot;

public record Bike(int qtyGear, double weight, int maxWeight, String brand, int price ,String owner) {

    private static final boolean isTwoWheels = true;

    public Bike() {
        this(27, 14.08 , 120, "Trek", 27000, "Dmytro");
    }

    public Bike(int qtyGear, double weight, int maxWeight, String brand) {
        this(qtyGear, weight, maxWeight, brand, 10000, "Steve");
    }

    @Override
    public String toString() {
        return " quantity of gears: " + qtyGear + "\n masa: " + weight + " kg" + "\n maxWeight: " + maxWeight + " kg" +
                "\n brand: " + brand + "\n price: " + price + " uah" + "\n owner: " + owner + "\n bike has two wheels: " + isTwoWheels() + "\n";
    }

    public static boolean isTwoWheels() {
        return isTwoWheels;
    }
}
