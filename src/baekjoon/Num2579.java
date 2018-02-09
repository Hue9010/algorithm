package baekjoon;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Num2579 {

//	@Test
//	public void test() {
//		int target = 6; // 도착점
//		int answer = 75;
//
//		int[] stairs = new int[301];
//		int[] dp = new int[301];
//		테스트용_배열_설정(stairs);
//		Arrays.fill(dp, -1);
//		dp[0] = 0;
//		dp[1] = stairs[1];
//		dp[2] = dp[1] + stairs[2];
//
//		assertThat(solution(target, stairs, dp), is(answer));
//	}
//
//	private static void 테스트용_배열_설정(int[] s​tairs) {
//		s​tairs[1] = 10;
//		s​tairs[2] = 20;
//		s​tairs[3] = 15;
//		s​tairs[4] = 25;
//		s​tairs[5] = 10;
//		s​tairs[6] = 20;
//	}
	
	private static int solution(int target, int[] stairs, int[] dp) {
		if (dp[target] != -1) {
			return dp[target];
		}
		dp[target] = stairs[target] + Math.max(stairs[target -1] + solution(target - 3, stairs, dp), solution(target - 2, stairs, dp));
		return dp[target];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stairs = new int[301];
		int[] dp = new int[301];
		Arrays.fill(dp, -1);

		int target = sc.nextInt();
		for(int i = 1; i <= target; i++) {
			stairs[i] = sc.nextInt();
		}
		
		dp[0] = stairs[0];
		dp[1] = Math.max(stairs[0]+stairs[1],stairs[1]);
		dp[2] = Math.max(stairs[0]+stairs[2],stairs[1]+stairs[2]);
		
		System.out.println(solution(target, stairs, dp));
		
		sc.close();
	}

}
