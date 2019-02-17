package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num2579 {

    public static int solution(int target, int[] stairs, int[] dp) {
        if (dp[target] != -1) {
            return dp[target];
        }
        dp[target] = stairs[target] + Math.max(stairs[target - 1] + solution(target - 3, stairs, dp), solution(target - 2, stairs, dp));
        return dp[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stairs = new int[301];
        int[] dp = new int[301];
        Arrays.fill(dp, -1);

        int target = sc.nextInt();
        for (int i = 1; i <= target; i++) {
            stairs[i] = sc.nextInt();
        }

        dp[0] = stairs[0];
        dp[1] = Math.max(stairs[0] + stairs[1], stairs[1]);
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        System.out.println(solution(target, stairs, dp));

        sc.close();
    }

}
