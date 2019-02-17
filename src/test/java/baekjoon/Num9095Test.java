package baekjoon;

import org.junit.Test;

import static baekjoon.Num9095.*;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Num9095Test {
    @Test
    public void test() {
        int[] dpArray = new int[11];
        Arrays.fill(dpArray, -1);
        dpArray[0] = 0;
        dpArray[1] = 1;
        dpArray[2] = 2;
        dpArray[3] = 4;

        assertThat(solution(dpArray, 4), is(7));
        assertThat(solution(dpArray, 7), is(44));
        assertThat(solution(dpArray, 10), is(274));
    }

}