package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet();

        for (int number : A) {
            set.add(number);
        }

        return set.size();
    }
}
