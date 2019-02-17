package codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        return calculator(A, getTotal(A));
    }

    private int calculator(int[] arr, int total) {
        int answer = Integer.MAX_VALUE;
        int pre = 0;
        int next = total;
        for (int i = 1; i < arr.length; i++) {
            pre += arr[i - 1];
            next = total - pre;
            answer = Math.min(Math.abs(pre - next), answer);
        }
        return answer;
    }

    private int getTotal(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
