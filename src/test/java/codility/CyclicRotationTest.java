package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CyclicRotationTest {
    private CyclicRotation cyclicRotation;

    @Before
    public void setup() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void firstCaseTest() {
        int[] arr = {3, 8, 9, 7, 6};
        int k = 3;
        int[] answer = {9, 7, 6, 3, 8};
        assertThat(cyclicRotation.solution(arr, k), is(answer));
    }

    @Test
    public void secondCaseTest() {
        int[] arr = {0, 0, 0};
        int k = 1;
        int[] answer = {0, 0, 0};
        assertThat(cyclicRotation.solution(arr, k), is(answer));
    }

    @Test
    public void thirdCaseTest() {
        int[] arr = {1, 2, 3, 4};
        int k = 4;
        int[] answer = {1, 2, 3, 4};
        assertThat(cyclicRotation.solution(arr, k), is(answer));
    }

}