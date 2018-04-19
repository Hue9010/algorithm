package codility;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotation {
	@Test
	public void firstCaseTest() {
		int[] arr = { 3, 8, 9, 7, 6 };
		int k = 3;
		int[] answer = { 9, 7, 6, 3, 8 };
		assertThat(solution(arr, k), is(answer));
	}

	@Test
	public void secondCaseTest() {
		int[] arr = { 0, 0, 0 };
		int k = 1;
		int[] answer = { 0, 0, 0 };
		assertThat(solution(arr, k), is(answer));
	}

	@Test
	public void thirdCaseTest() {
		int[] arr = { 1, 2, 3, 4 };
		int k = 4;
		int[] answer = { 1, 2, 3, 4 };
		assertThat(solution(arr, k), is(answer));
	}

	public int[] solution(int[] A, int K) {
		int length = A.length;
		if (length == 0) {
			return A;
		}
		int moveCount = K % length;
		if (moveCount == 0) {
			return A;
		}
		return getAnswers(A, length, moveCount);
	}

	private int[] getAnswers(int[] A, int length, int moveCount) {
		int[] answers = new int[length];
		for (int i = 0; i < length; i++) {
			int index = i + moveCount;
			if (index >= length) {
				index -= length;
			}
			answers[index] = A[i];
		}
		return answers;
	}

}
