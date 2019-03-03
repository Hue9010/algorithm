package programmers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Sort1Test {
    private Sort1 sort1 = new Sort1();

    @Test
    public void 테스트_케이스() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = {5, 6, 3};

        assertThat(sort1.solution(array, commands), is(answer));
    }
}