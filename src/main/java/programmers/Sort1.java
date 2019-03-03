package programmers;

import java.util.Arrays;

public class Sort1 {
    public int[] solution(int[] array, int[][] commands) {
        int inputAmount = commands.length;
        int[] answer = new int[inputAmount];
        int[] slicedArray;

        for (int i = 0; i < inputAmount; i++) {
            slicedArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(slicedArray);
            answer[i] = slicedArray[commands[i][2] - 1];
        }

        return answer;
    }
}
