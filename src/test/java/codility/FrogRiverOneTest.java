package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @Before
    public void setup() {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void frogRiverOneTest() {
        int[] arr = {1, 3, 1, 4, 2, 3, 5, 4};
        assertEquals(frogRiverOne.solution(5, arr), 6);
    }


}