package ua.lviv.iot;

import org.junit.jupiter.api.Assertions;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.jupiter.api.Assertions.*;

class BusRouteTest {

    @org.junit.jupiter.api.Test
    void writeBusRoute() {
        String input = "bus_123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("bus_123", input);
    }

    @org.junit.jupiter.api.Test
    void checkInputString() {
        assertThat("bus_123", matchesPattern("^([a-zA-Z]+)\\_(\\d{1,3})"));
    }

    @org.junit.jupiter.api.Test
    void changeNumberOfBusRoute() {
        assertThat("423", matchesPattern("^(\\d{1,3})"));
    }
}