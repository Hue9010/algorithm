package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {
    private PermMissingElem permMissingElem;

    @Before
    public void setup() {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void PermMissingElemTest() {
        int[] arr = {2, 3, 1, 5};
        assertEquals(permMissingElem.solution(arr), 4);
    }


}