package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
    private MissingInteger missingInteger;

    @Before
    public void setup() {
        missingInteger = new MissingInteger();
    }

    @Test
    public void missingIntegerTest() {
        int[] arr = {1, 2, 3};
        assertEquals(missingInteger.solution(arr), 4);
    }

    @Test
    public void missingIntegerSecondTest() {
        int[] arr = {-1, -3};
        assertEquals(missingInteger.solution(arr), 1);
    }

}