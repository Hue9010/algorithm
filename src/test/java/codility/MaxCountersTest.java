package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxCountersTest {
    private MaxCounters maxCounters;

    @Before
    public void setup() {
        maxCounters = new MaxCounters();
    }

    @Test
    public void maxCountersTest() {
        int[] inputArr = {3, 4, 4, 6, 1, 4, 4};
        int[] answer = {3, 2, 2, 4, 2};
        assertThat(maxCounters.solution(5, inputArr), is(answer));
    }


}