package programmers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Hash3Test {
    private Hash3 hash3;

    @Before
    public void setup() {
        hash3 = new Hash3();
    }

    @Test
    public void 첫번째_케이스_테스트() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = hash3.solution(clothes);
        assertThat(answer, is(5));
    }

    @Test
    public void 두번째_케이스_테스트() {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = hash3.solution(clothes);
        assertThat(answer, is(3));
    }

}