package ua.lviv.iot.fourthLab.Details;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LightTest {

    private static final String MATERIAL = "manufacture";
    Light light1;

    @BeforeEach
    void prepareData() {
        light1 = new Light("model", 10.2, 200.4, "manufacture", "plastic", "white");
    }

    @Test
    void basicConstructorWithGetters() {
        assertThat(light1.getManufacture(), equalTo(MATERIAL));
    }

    @Test
    void getMaterial() {
        assertEquals("plastic", light1.getMaterial());
    }

    @Test
    void getColor() {
        assertEquals("white", light1.getColor());
    }


    @Test
    void testToString() {
    }
}