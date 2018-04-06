package codility;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class OddOccurrencesInArray {
	@Test
	public void solutionTest() {
		int[] arr = { 9, 3, 9, 3, 9, 7, 9 };
		assertEquals(solution(arr), 7);
	}

	public int solution(int[] A) {
		return getUniqueNumber(deleteRepeatNumber(A));
	}

	private int getUniqueNumber(Set<Integer> numbers) {
		int answer = 0;
		for (int number : numbers) {
			answer = number;
		}
		return answer;
	}

	private Set<Integer> deleteRepeatNumber(int[] arr) {
		Set<Integer> numbers = new HashSet<>();
		for (int number : arr) {
			if (numbers.contains(number)) {
				numbers.remove(number);
				continue;
			}
			numbers.add(number);
		}
		return numbers;
	}

}
