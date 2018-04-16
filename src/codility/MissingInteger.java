package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingInteger {
	@Test
	public void missingIntegerTest() {
		int[] arr = { 1, 2, 3 };
		assertEquals(solution(arr), 4);
	}

	@Test
	public void missingIntegerSecondTest() {
		int[] arr = { -1, -3 };
		assertEquals(solution(arr), 1);
	}

	public int solution(int[] A) {
		return getAnswer(A, setupFlag(A));
	}

	private int getAnswer(int[] A, boolean[] flag) {
		for (int i = 1; i < flag.length; i++) {
			if (flag[i] == false) {
				return i;
			}
		}
		return A.length + 1;
	}

	private boolean[] setupFlag(int[] A) {
		boolean[] flag = new boolean[A.length + 1];
		for (int i : A) {
			if (i < 0 || i > A.length) {
				continue;
			}
			flag[i] = true;
		}
		return flag;
	}
}
