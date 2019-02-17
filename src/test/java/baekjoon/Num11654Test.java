package baekjoon;

import org.junit.Test;

import static baekjoon.Num11654.solution;
import static org.junit.Assert.assertEquals;

public class Num11654Test {

    @Test
    public void test() {
        assertEquals(65, solution('A'));
        assertEquals(48, solution('0'));
    }

}