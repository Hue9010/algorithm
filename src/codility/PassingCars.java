package codility;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PassingCars {
	@Test
	public void passingCarsTest() {
		int[] arr = { 0, 1, 0, 1, 1 };
		assertThat(solution(arr), is(5));
	}

	public int solution(int[] A) {
		int answer = 0;
		int eastCars = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				eastCars++;
				continue;
			}
			answer += eastCars * 1;
			if (answer > 1000000000) {
				return -1;
			}
		}
		return answer;
	}
}
