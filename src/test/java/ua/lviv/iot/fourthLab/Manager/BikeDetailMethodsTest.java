package ua.lviv.iot.fourthLab.Manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.fourthLab.BikeDetail;
import ua.lviv.iot.fourthLab.Details.Light;
import ua.lviv.iot.fourthLab.Details.Lock;
import ua.lviv.iot.fourthLab.Details.Pump;

import java.util.ArrayList;
import java.util.List;

public class BikeDetailMethodsTest {
    private static final BikeDetail BIKE_DETAIL = new BikeDetail("favie", 32.4, 2100, "a");
    private static final Lock LOCK = new Lock("solar", 12.6, 1800, "c", "steel", 120);
    private static final Pump PUMP = new Pump("quvie", 4.5, 1200.0, "f", 25.25, "red");
    private static final Light LIGHT = new Light("bogie", 2.1, 2000, "b", "sefde", "orange");


    private List<BikeDetail> bikeDetails;

    @BeforeEach
    void SetUp() {
        bikeDetails = new ArrayList<>(List.of(BIKE_DETAIL, LOCK, PUMP, LIGHT));
    }

    @Test
    void sortingByWeightASCTest() {
//        given
        List<BikeDetail> expectedItems = List.of(LIGHT, PUMP, LOCK, BIKE_DETAIL);
//        when
        bikeDetails.sort(new WeightComparatorASC());
//        then
        Assertions.assertIterableEquals(bikeDetails, expectedItems);
    }

    @Test
    void sortingByWeightDESCTest() {
//        given
        List<BikeDetail> expectedItems = List.of(BIKE_DETAIL, LOCK, PUMP, LIGHT);
//        when
        bikeDetails.sort(new WeightComparatorDESC());
//        then
        Assertions.assertIterableEquals(bikeDetails, expectedItems);
    }

    @Test
    void sortingByManufactureASC() {
//        given
        List<BikeDetail> expectedItems = List.of(BIKE_DETAIL, LIGHT, LOCK, PUMP);
//        when
        bikeDetails.sort(new ManufactureComparatorASC());
//        then
        Assertions.assertIterableEquals(bikeDetails, expectedItems);
    }

    @Test
    void sortingByManufactureDESC() {
//        given
        List<BikeDetail> expectedItems = List.of(PUMP, LOCK, LIGHT, BIKE_DETAIL);
//        when
        bikeDetails.sort(new ManufactureComparatorDESC());
//        then
        Assertions.assertIterableEquals(bikeDetails, expectedItems);
    }

    @Test
    void searchingElement() {
//        given
        List<BikeDetail> foundElList = List.of(LOCK);
//        when
        List<BikeDetail> bikeDetails1 = bikeDetails.stream().filter(e -> e.getModel().equals("solar")).toList();
//        then
        Assertions.assertIterableEquals(bikeDetails1, foundElList);
    }


}
