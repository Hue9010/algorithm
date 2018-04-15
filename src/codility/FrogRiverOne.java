package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOne {
	@Test
	public void frogRiverOneTest() {
		int[] arr = { 1, 3, 1, 4, 2, 3, 5, 4 };
		assertEquals(solution(5, arr), 6);
	}

	public int solution(int X, int[] A) {
		return findMaxTime(getLeavesArray(X, A));
	}

	private int[] getLeavesArray(int positon, int[] arr) {
		int[] leavesArr = initLeavesArray(positon);
		for (int i = 0; i < arr.length; i++) {
			if (leavesArr[arr[i]] != -1) {
				continue;
			}
			leavesArr[arr[i]] = i;
		}
		return leavesArr;
	}

	private int[] initLeavesArray(int positon) {
		int[] leavesArr = new int[positon + 1];
		for (int i = 0; i < leavesArr.length; i++) {
			leavesArr[i] = -1;
		}
		return leavesArr;
	}

	private int findMaxTime(int[] leavesArr) {
		int answer = Integer.MIN_VALUE;
		for (int i = 1; i < leavesArr.length; i++) {
			if (leavesArr[i] == -1) {
				return -1;
			}
			answer = leavesArr[i] > answer ? leavesArr[i] : answer;
		}
		return answer;
	}

}