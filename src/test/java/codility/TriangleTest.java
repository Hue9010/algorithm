package codility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setup() {
        triangle = new Triangle();
    }

    @Test
    public void TriangleFirstTestCase() {
        int arr[] = {10, 2, 5, 1, 8, 20};
        assertThat(triangle.solution(arr), is(1));
    }

    @Test
    public void TriangleSecondTestCase() {
        int arr[] = {10, 50, 5, 1};
        assertThat(triangle.solution(arr), is(0));
    }

}