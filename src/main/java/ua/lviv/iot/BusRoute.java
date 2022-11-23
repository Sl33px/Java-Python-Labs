package ua.lviv.iot;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusRoute {

    public String writeBusRoute() {
        Scanner inputBusRoute = new Scanner(System.in);
        System.out.println("Enter bus route:");

        String busRoute = inputBusRoute.nextLine();
        return busRoute;
    }

    public void checkInputString(String inputBusRoute) {
//      check if input value is equal to regex
        Pattern pattern = Pattern.compile("^([a-zA-Z]+)\\_(\\d{1,3})");
        Matcher matcher = pattern.matcher(inputBusRoute);

        if (matcher.matches()) {
            changeNumberOfBusRoute(matcher);

        } else {
            System.out.println("Write bus route right, please !");
            writeBusRoute();
        }
    }

    public void changeNumberOfBusRoute(Matcher matcher) {
//  change number of bus
        String changedRoute = matcher.group(1);

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter new bus num:");
        String busNum = inputNum.nextLine();

        //      check if input value is equal to regex
        Pattern pattern = Pattern.compile("^(\\d{1,3})");
        Matcher matcherNum = pattern.matcher(busNum);

        if (matcherNum.matches()) {
            changedRoute = changedRoute + "_" + busNum;
            System.out.println("Changed bus route: " + changedRoute);
        } else {
            System.out.println("Write bus num right, please !");
            changeNumberOfBusRoute(matcher);
        }
    }
}
