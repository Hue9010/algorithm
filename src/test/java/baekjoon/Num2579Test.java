package baekjoon;

import org.junit.Test;

import java.util.Arrays;

import static baekjoon.Num2579.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Num2579Test {

    @Test
    public void test() {
        int target = 6; // 도착점
        int answer = 75;

        int[] stairs = new int[301];
        int[] dp = new int[301];
        테스트용_배열_설정(stairs);
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = stairs[1];
        dp[2] = dp[1] + stairs[2];

        assertThat(solution(target, stairs, dp), is(answer));
    }

    private static void 테스트용_배열_설정(int[] s​tairs) {
        s​tairs[1] = 10;
        s​tairs[2] = 20;
        s​tairs[3] = 15;
        s​tairs[4] = 25;
        s​tairs[5] = 10;
        s​tairs[6] = 20;
    }


}