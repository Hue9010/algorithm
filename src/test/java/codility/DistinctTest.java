package codility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DistinctTest {
    Distinct distinct = new Distinct();

    @Test
    public void first_test_case() {
        int[] exampleArr = {2, 1, 1, 2, 3, 1};
        int answer = distinct.solution(exampleArr);

        assertThat(answer, is(3));
    }

}
