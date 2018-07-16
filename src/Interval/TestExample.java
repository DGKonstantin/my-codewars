package Interval;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;
import java.util.*;


public class TestExample {
    @Test
    public void exampleTest() {
        assertArrayEquals(new int[]{2,3,4},Math.Interval(new int[] {1,2,3,4,5}, "[2,5)"));
        assertArrayEquals(new int[]{2,3,4,5},Math.Interval(new int[] {1,2,3,4,5}, "[2,5]"));
        assertArrayEquals(new int[]{3,4,5},Math.Interval(new int[] {1,2,3,4,5}, "(2,5]"));
        assertArrayEquals(new int[]{3,4},Math.Interval(new int[] {1,2,3,4,5}, "(2,5)"));
        assertArrayEquals(new int[]{},Math.Interval(new int[] {1,2,3,4,5}, ""));
        assertArrayEquals(new int[]{},Math.Interval(new int[] {}, "(2,5)"));
    }
}
