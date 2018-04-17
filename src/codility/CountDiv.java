package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDiv {
	@Test
	public void countDivTest() {
		assertEquals(solution(6, 11, 2), 3);
	}

	@Test
	public void countDivTest2() {
		assertEquals(solution(11, 345, 17), 20);
	}

	public int solution(int A, int B, int K) {
		int answer = B / K + 1;
		if (A != 0) {
			answer -= ((A - 1) / K + 1);
		}
		return answer;
	}

}
