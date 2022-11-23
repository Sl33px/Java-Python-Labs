package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        BusRoute busRoute = new BusRoute();
        String inputBusRoute = busRoute.writeBusRoute();
        System.out.println("You entered: " + inputBusRoute);
        busRoute.checkInputString(inputBusRoute);
    }
}