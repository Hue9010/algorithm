package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num9095 {

    public static int solution(int[] dpArray, int target) {
        if (dpArray[target] == -1) {
            dpArray[target] = solution(dpArray, target - 1) + solution(dpArray, target - 2) + solution(dpArray, target - 3);
        }
        return dpArray[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] dpArray = new int[11];
        Arrays.fill(dpArray, -1);
        dpArray[0] = 0;
        dpArray[1] = 1;
        dpArray[2] = 2;
        dpArray[3] = 4;

        for (int i = 0; i < number; i++) {
            int targetNumber = sc.nextInt();
            System.out.println(solution(dpArray, targetNumber));
        }
        sc.close();
    }

}
