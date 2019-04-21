package codility;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void 첫번째_테스트_케이스() {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] answer = {2, 4, 1};

        assertThat(genomicRangeQuery.solution3(S, P, Q), is(answer));
    }

    @Test
    public void 두번째_테스트_케이스() {
        String S = "A";
        int[] P = {0};
        int[] Q = {0};
        int[] answer = {1};

        assertThat(genomicRangeQuery.solution3(S, P, Q), is(answer));
    }
}
