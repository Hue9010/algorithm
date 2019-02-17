package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice;

    @Before
    public void setup() {
        minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void minAvgTwoSliceTest() {
        int[] arr = {4, 2, 2, 5, 1, 5, 8};
        assertThat(minAvgTwoSlice.solution(arr), is(1));
    }

}