package ua.lviv.iot.fourthLab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeDetailTest {

    private static final String MODEL = "favie";
    BikeDetail bikeDetail;

    @BeforeEach
    void prepareData() {
        bikeDetail = new BikeDetail("favie", 32.4, 2100, "a");
    }

    @Test
    void basicConstructorWithGetters() {
        assertThat(bikeDetail.getModel(), equalTo(MODEL));
    }

    @Test
    void getModel() {
        assertEquals("favie", bikeDetail.getModel());
    }

    @Test
    void getWeight() {
        assertEquals(32.4, bikeDetail.getWeight());
    }

    @Test
    void getPrice() {
        assertEquals(2100, bikeDetail.getPrice());
    }

    @Test
    void getManufacture() {
        assertEquals("a", bikeDetail.getManufacture());
    }

    @Test
    void testToString() {
    }
}