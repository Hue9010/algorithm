package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheck {

	@Test
	public void PermCheckTest() {
		int[] arr = { 4, 1, 3, 2 };
		assertEquals(solution(arr), 1);
	}

	@Test
	public void PermCheckFailTest() {
		int[] arr = { 4, 1, 3 };
		assertEquals(solution(arr), 0);
	}

	public int solution(int[] A) {
		boolean[] flag = new boolean[A.length + 1];
		return calculateSum(A, flag);
	}

	private int calculateSum(int[] arr, boolean[] flag) {
		long sum = getSum(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr.length) {
				return 0;
			}
			if (flag[arr[i]] == true) {
				return 0;
			}
			sum -= arr[i];
			flag[arr[i]] = true;
		}
		return sum == 0 ? 1 : 0;
	}

	private long getSum(int[] arr) {
		return arr.length * (arr.length + 1) / 2;
	}
}
