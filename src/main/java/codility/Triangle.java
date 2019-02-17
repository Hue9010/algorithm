package codility;

import java.util.Arrays;

public class Triangle {

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
