package codility;

public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int answer = 0;
        double minAvg = (A[0] + A[1]) / 2;
        double nowAvg = minAvg;

        for (int i = 2; i < A.length; i++) {
            nowAvg = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
            if (nowAvg < minAvg) {
                minAvg = nowAvg;
                answer = i - 2;
            }
            nowAvg = (A[i - 1] + A[i]) / 2.0;
            if (nowAvg < minAvg) {
                minAvg = nowAvg;
                answer = i - 1;
            }
        }
        return answer;
    }
}
