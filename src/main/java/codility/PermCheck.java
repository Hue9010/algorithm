package codility;

public class PermCheck {

    public int solution(int[] A) {
        boolean[] flag = new boolean[A.length + 1];
        return calculateSum(A, flag);
    }

    private int calculateSum(int[] arr, boolean[] flag) {
        long sum = getSum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr.length) {
                return 0;
            }
            if (flag[arr[i]] == true) {
                return 0;
            }
            sum -= arr[i];
            flag[arr[i]] = true;
        }
        return sum == 0 ? 1 : 0;
    }

    private long getSum(int[] arr) {
        return arr.length * (arr.length + 1) / 2;
    }
}
