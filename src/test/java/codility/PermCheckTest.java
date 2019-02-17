package codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
    private PermCheck permCheck;

    @Before
    public void setup() {
        permCheck = new PermCheck();
    }

    @Test
    public void PermCheckTest() {
        int[] arr = {4, 1, 3, 2};
        assertEquals(permCheck.solution(arr), 1);
    }

    @Test
    public void PermCheckFailTest() {
        int[] arr = {4, 1, 3};
        assertEquals(permCheck.solution(arr), 0);
    }


}