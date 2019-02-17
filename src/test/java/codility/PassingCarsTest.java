package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PassingCarsTest {
    private PassingCars passingCars;

    @Before
    public void setup() {
        passingCars = new PassingCars();
    }

    @Test
    public void passingCarsTest() {
        int[] arr = {0, 1, 0, 1, 1};
        assertThat(passingCars.solution(arr), is(5));
    }

}