package ua.lviv.iot.fourthLab;


import ua.lviv.iot.fourthLab.Details.Light;
import ua.lviv.iot.fourthLab.Details.Lock;
import ua.lviv.iot.fourthLab.Details.Pump;
import ua.lviv.iot.fourthLab.Manager.ManufactureComparatorASC;
import ua.lviv.iot.fourthLab.Manager.ManufactureComparatorDESC;
import ua.lviv.iot.fourthLab.Manager.WeightComparatorASC;
import ua.lviv.iot.fourthLab.Manager.WeightComparatorDESC;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<BikeDetail> bikeDetails = new ArrayList<>();

        bikeDetails.add(new BikeDetail("favie", 32.4, 2100, "a"));
        bikeDetails.add(new Lock("solar", 12.6, 1800, "c", "steel", 120));
        bikeDetails.add(new Pump("quvie", 4.5, 1200.0, "f", 25.25, "red"));
        bikeDetails.add(new Light("bogie", 2.1, 2000, "b", "sefde", "orange"));

//      pass list of objects as argument of writer
        BikeDetailWriter bikeDetailWriter = new BikeDetailWriter();
        bikeDetailWriter.writeToFile(bikeDetails);

        System.out.println("ArrayList of objects:");
        for (Object e : bikeDetails) {
            System.out.println(e);
        }
        System.out.println("/////////////");
        System.out.println("");


//      sorting by weight Ascending
        System.out.println("sorting by weight asc:");
        bikeDetails.sort(new WeightComparatorASC());
        for (Object e : bikeDetails) {
            System.out.println(e);
        }
        System.out.println("/////////////");
        System.out.println("");


//      sorting by weight Descending
        System.out.println("sorting by weight desc:");
        bikeDetails.sort(new WeightComparatorDESC());
        for (Object e : bikeDetails) {
            System.out.println(e);
        }
        System.out.println("/////////////");
        System.out.println("");

//      sorting by manufacture Ascending
        System.out.println("sorting by manufacture asc:");
        bikeDetails.sort(new ManufactureComparatorASC());
        for (Object e : bikeDetails) {
            System.out.println(e);
        }
        System.out.println("/////////////");
        System.out.println("");

//      sorting by manufacture Descending
        System.out.println("sorting by manufacture desc:");
        bikeDetails.sort(new ManufactureComparatorDESC());
        for (Object e : bikeDetails) {
            System.out.println(e);
        }

        System.out.println("/////////////");
        System.out.println("");

//      searching element
        System.out.println("searching element:");
        List<BikeDetail> foundElList = bikeDetails.stream().filter(e -> e.getModel().equals("solar")).toList();
        System.out.println(foundElList);

        System.out.println("/////////////");
        System.out.println("");
    }
}