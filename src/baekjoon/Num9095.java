package baekjoon;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class Num9095 {
//	@Test
//	public void test() {
//		int[] dpArray = new int[11];
//		Arrays.fill(dpArray, -1);
//		dpArray[0] = 0;
//		dpArray[1] = 1;
//		dpArray[2] = 2;
//		dpArray[3] = 4;
//
//		assertThat(solution(dpArray, 4), is(7));
//		assertThat(solution(dpArray, 7), is(44));
//		assertThat(solution(dpArray, 10), is(274));
//	}

	private static int solution(int[] dpArray, int target) {
		if (dpArray[target] == -1) {
			dpArray[target] = solution(dpArray, target - 1) + solution(dpArray, target - 2)	+ solution(dpArray, target - 3);
		}
		return dpArray[target];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] dpArray = new int[11];
		Arrays.fill(dpArray, -1);
		dpArray[0] = 0;
		dpArray[1] = 1;
		dpArray[2] = 2;
		dpArray[3] = 4;

		for (int i = 0; i < number; i++) {
			int targetNumber = sc.nextInt();
			System.out.println(solution(dpArray, targetNumber));
		}
		sc.close();
	}

}
