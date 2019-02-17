package codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

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
