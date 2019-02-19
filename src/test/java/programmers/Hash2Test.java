package programmers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Hash2Test {
    private Hash2 hash2;

    @Before
    public void setup() {
        hash2 = new Hash2();
    }

    @Test
    public void 첫번째_케이스_테스트() {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        assertThat(hash2.solution(phoneBook), is(false));
    }

    @Test
    public void 두번째_케이스_테스트() {
        String[] phoneBook = {"123", "456", "789"};
        assertThat(hash2.solution(phoneBook), is(true));
    }

    @Test
    public void 번째_케이스_테스트() {
        String[] phoneBook = {"12", "123", "1235", "567", "88"};
        assertThat(hash2.solution(phoneBook), is(false));
    }

}