package programmers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Hash1Test {
    private Hash1 hash1;

    @Before
    public void setup() {
        hash1 = new Hash1();
    }

    @Test
    public void 첫번째_케이스Test() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        assertThat(hash1.solution(participant, completion), is("leo"));
    }

    @Test
    public void 두번째_케이스_Test() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        assertThat(hash1.solution(participant, completion), is("vinko"));

    }

    @Test
    public void 세번째_케이스_Test() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        assertThat(hash1.solution(participant, completion), is("mislav"));

    }

}