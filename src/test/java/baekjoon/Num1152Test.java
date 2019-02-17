package baekjoon;

import static baekjoon.Num1152.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class Num1152Test {

    @Test
    public void test() {
        String example = "The Curious Case of Benjamin Button";
        assertEquals(6, solution(example));
    }

}