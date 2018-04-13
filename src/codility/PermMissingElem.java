package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElem {

	@Test
	public void PermMissingElemTest() {
		int[] arr = { 2, 3, 1, 5 };
		assertEquals(solution(arr), 4);
	}

	public int solution(int[] A) {
		long num = A.length + 1;
		long sum = num * (num + 1) / 2;
		for (int i = 0; i < A.length; i++) {
			sum -= A[i];
		}
		return (int) sum;
	}

}
