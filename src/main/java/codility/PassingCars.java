package codility;

public class PassingCars {

    public int solution(int[] A) {
        int answer = 0;
        int eastCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                eastCars++;
                continue;
            }
            answer += eastCars * 1;
            if (answer > 1000000000) {
                return -1;
            }
        }
        return answer;
    }
}
