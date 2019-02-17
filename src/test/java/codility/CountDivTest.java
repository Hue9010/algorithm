package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest {

    private CountDiv countDiv;

    @Before
    public void setup() {
        countDiv = new CountDiv();
    }

    @Test
    public void countDivTest() {
        assertEquals(countDiv.solution(6, 11, 2), 3);
    }

    @Test
    public void countDivTest2() {
        assertEquals(countDiv.solution(11, 345, 17), 20);
    }


}