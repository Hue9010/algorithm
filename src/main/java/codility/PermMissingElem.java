package codility;

public class PermMissingElem {

    public int solution(int[] A) {
        long num = A.length + 1;
        long sum = num * (num + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return (int) sum;
    }

}
