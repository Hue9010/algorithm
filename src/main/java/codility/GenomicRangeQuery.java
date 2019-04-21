package codility;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {


        int[] A = initArr(S, 'A');
        int[] C = initArr(S, 'C');
        int[] G = initArr(S, 'G');

        updateArr(S, A, C, G);

        int[] answer = getAnswer(P, Q, A, C, G);

        return answer;
    }

    private int[] initArr(String word, char letter) {
        int[] arr = new int[word.length()];

        if (word.charAt(0) == letter) {
            arr[0] = 1;
        }
        return arr;
    }

    private void updateArr(String S, int[] A, int[] C, int[] G) {
        int length = S.length();
        for (int i = 1; i < length; i++) {
            char c = S.charAt(i);

            if (c == 'A') {
                A[i] = A[i - 1] + 1;
                C[i] = C[i - 1];
                G[i] = G[i - 1];
            } else if (c == 'C') {
                A[i] = A[i - 1];
                C[i] = C[i - 1] + 1;
                G[i] = G[i - 1];
            } else if (c == 'G') {
                A[i] = A[i - 1];
                C[i] = C[i - 1];
                G[i] = G[i - 1] + 1;
            } else {
                A[i] = A[i - 1];
                C[i] = C[i - 1];
                G[i] = G[i - 1];
            }
        }
    }

    private int[] getAnswer(int[] P, int[] Q, int[] a, int[] c, int[] g) {
        int[] answer = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int startIdx = P[i] - 1;
            int endIdx = Q[i];
            if (P[i] > 0) {
                if (hasDNAletter(a, startIdx, endIdx)) {
                    answer[i] = 1;
                } else if (hasDNAletter(c, startIdx, endIdx)) {
                    answer[i] = 2;
                } else if (hasDNAletter(g, startIdx, endIdx)) {
                    answer[i] = 3;
                } else {
                    answer[i] = 4;
                }
            } else {
                if (0 < a[endIdx]) {
                    answer[i] = 1;
                } else if (0 < c[endIdx]) {
                    answer[i] = 2;
                } else if (0 < g[endIdx]) {
                    answer[i] = 3;
                } else {
                    answer[i] = 4;
                }
            }
        }
        return answer;
    }

    private boolean hasDNAletter(int[] arr, int startIdx, int endIdx) {
        return arr[startIdx] < arr[endIdx];
    }

}