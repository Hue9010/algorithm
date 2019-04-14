package codility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void 첫번째_테스트_케이스() {
        int answer = frogJmp.solution(10, 85, 30);
        assertThat(answer, is(3));

    }

    @Test
    public void 두번째_테스트_케이스() {
        int answer = frogJmp.solution(1, 1, 30);
        assertThat(answer, is(0));

    }

    @Test
    public void 세번째_테스트_케이스() {
        int answer = frogJmp.solution(20, 80, 20);
        assertThat(answer, is(3));

    }
}