package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setup() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void 테스트케이스() {
        int[] arr = {3, 1, 2, 4, 3};
        assertEquals(tapeEquilibrium.solution(arr), 1);
    }


}