package codility;

public class MissingInteger {

    public int solution(int[] A) {
        return getAnswer(A, setupFlag(A));
    }

    private int getAnswer(int[] A, boolean[] flag) {
        for (int i = 1; i < flag.length; i++) {
            if (flag[i] == false) {
                return i;
            }
        }
        return A.length + 1;
    }

    private boolean[] setupFlag(int[] A) {
        boolean[] flag = new boolean[A.length + 1];
        for (int i : A) {
            if (i < 0 || i > A.length) {
                continue;
            }
            flag[i] = true;
        }
        return flag;
    }
}
