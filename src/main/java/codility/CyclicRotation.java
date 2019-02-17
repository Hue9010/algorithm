package codility;

public class CyclicRotation {

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
