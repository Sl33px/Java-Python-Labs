package ua.lviv.iot.fourthLab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.fourthLab.Details.Light;
import ua.lviv.iot.fourthLab.Details.Lock;
import ua.lviv.iot.fourthLab.Details.Pump;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

class BikeDetailWriterTest {

//    BikeDetail bikeDetails;

//    @BeforeEach
//    void prepareData() {
        List<BikeDetail> bikeDetails = new ArrayList<>();
//    }

    @Test
    void addItemTest() {
//        given
        BikeDetail bikeDetail = new BikeDetail("favie", 32.4, 2100, "a");
//        when
        bikeDetails.add(bikeDetail);
//        then
        Assertions.assertIterableEquals(bikeDetails, List.of(bikeDetail));
    }

    @Test
    void addItemsTest() {
//        given
        BikeDetail bikeDetail = new BikeDetail("favie", 32.4, 2100, "a");
        BikeDetail lock = new Lock("solar", 12.6, 1800, "c", "steel", 120);
        BikeDetail pump = new Pump("quvie", 4.5, 1200.0, "f", 25.25, "red");
        BikeDetail light = new Light("bogie", 2.1, 2000, "b", "sefde", "orange");
//        when
        bikeDetails.add(bikeDetail);
        bikeDetails.add(lock);
        bikeDetails.add(pump);
        bikeDetails.add(light);
//        then
        assertThat(bikeDetails, hasItems(bikeDetail, lock, pump, light));
    }
}