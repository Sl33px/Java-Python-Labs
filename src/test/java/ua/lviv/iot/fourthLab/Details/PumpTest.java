package ua.lviv.iot.fourthLab.Details;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class PumpTest {
    private static final String COLOR = "red";
    Pump pump;
    @BeforeEach
    void prepareData() {
        pump = new Pump("quvie", 4.5, 1200.0, "f", 25.25, "red");
    }

    @Test
    void basicConstructorWithGetters() {
        assertThat(pump.getColor(), equalTo(COLOR));
    }

    @Test
    void getPressure() {
        assertEquals(25.25, pump.getPressure());
    }

    @Test
    void getColor() {
        assertEquals("red", pump.getColor());
    }

    @Test
    void testToString() {
    }
}