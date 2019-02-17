package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setup() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void solutionTest() {
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(oddOccurrencesInArray.solution(arr), 7);
    }

}