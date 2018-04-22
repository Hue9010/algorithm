package codility;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class Triangle {
	@Test
	public void TriangleFirstTestCase() {
		int arr[] = { 10, 2, 5, 1, 8, 20 };
		assertThat(solution(arr), is(1));
	}

	@Test
	public void TriangleSecondTestCase() {
		int arr[] = { 10, 50, 5, 1 };
		assertThat(solution(arr), is(0));
	}

	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 2; i < A.length; i++) {
			if ((double) A[i - 2] + (double) A[i - 1] > A[i]) {
				return 1;
			}
		}
		return 0;
	}
}
