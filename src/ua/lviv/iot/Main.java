package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        Bike firstBike = new Bike();
        Bike secondBike = new Bike(21, 23.4, 130, "Pinarello", 23000, "Andrew");
        Bike thirdBike = new Bike(23, 30.4, 110, "Electra");

        System.out.println(firstBike.toString());
        System.out.println(secondBike.toString());
        System.out.println(thirdBike.toString());
    }
}