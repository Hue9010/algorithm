package baekjoon;

import org.junit.Test;

import static org.junit.Assert.*;
import static baekjoon.Num10809.*;

public class Num10809Test {

    @Test
    public void test() {
        String example = "baekjoon";
        String answer = "1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1";
        assertEquals(answer, solution(example));
    }


}