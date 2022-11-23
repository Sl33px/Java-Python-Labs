package ua.lviv.iot.fourthLab.Details;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LockTest {
    private static final int LENGTHOFCABLE = 120;
    Lock lock;

    @BeforeEach
    void prepareData() {
        lock = new Lock("solar", 12.6, 1800, "c", "steel", 120);
    }

    @Test
    void basicConstructorWithGetters() {
        assertThat(lock.getLengthOfCable(), equalTo(LENGTHOFCABLE));
    }

    @Test
    void getMaterial() {
        assertEquals("steel", lock.getMaterial());
    }

    @Test
    void getLengthOfCable() {
        assertEquals(120, lock.getLengthOfCable());
    }

    @Test
    void testToString() {
    }
}