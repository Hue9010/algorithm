package programmers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Sort2Test {
    private Sort2 sort2 = new Sort2();

    @Test
    public void 첫번째_테스트_케이스() {
        int[] numbers = {6, 10, 2};
        assertThat("6210", is(sort2.solution(numbers)));
    }

    @Test
    public void 두번째_테스트_케이스() {
        int[] numbers = {3, 30, 34, 5, 9};
        assertThat("9534330", is(sort2.solution(numbers)));
    }

}
