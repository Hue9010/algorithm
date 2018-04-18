package codility;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCounters {
	@Test
	public void maxCountersTest() {
		int[] inputArr = { 3, 4, 4, 6, 1, 4, 4 };
		int[] answer = { 3, 2, 2, 4, 2 };
		assertThat(solution(5, inputArr), is(answer));
	}

	public int[] solution(int N, int[] A) {
		int[] answerArr = new int[N];
		int max = 0;
		int tempMax = 0;
		for (int i = 0; i < A.length; i++) {
			int index = A[i] - 1;
			if (A[i] <= N) {
				if (answerArr[index] < max) {
					answerArr[index] = max;
				}
				answerArr[index]++;
				tempMax = Math.max(tempMax, answerArr[index]);
			}
			if (A[i] == N + 1) {
				max = Math.max(max, tempMax);
			}
		}
		for (int i = 0; i < answerArr.length; i++) {
			if (answerArr[i] < max) {
				answerArr[i] = max;
			}
		}
		return answerArr;
	}

}
