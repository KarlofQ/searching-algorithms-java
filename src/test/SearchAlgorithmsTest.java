package test;

import main.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchAlgorithmsTest {

    @Test
    public void testLinearSearch() {
        int[] array = {1024, 34, 1, 65, 2782, 74, 123, 453,987, 654, 867};
        int target = 654;
        int expectedIndex = 9;
        assertEquals(expectedIndex, LinearSearch.search(array, target));
    }

    @Test
    public void testBinarySearch() {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;
        int expectedIndex = 6;
        assertEquals(expectedIndex, BinarySearch.search(array, target));
    }

    @Test
    public void testInterpolationSearch() {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;
        int expectedIndex = 6;
        assertEquals(expectedIndex, InterpolationSearch.search(array, target));
    }

    @Test
    public void testJumpSearch() {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;
        int expectedIndex = 6;
        assertEquals(expectedIndex, JumpSearch.search(array, target));
    }

    @Test
    public void testTernarySearch() {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;
        int expectedIndex = 6;
        assertEquals(expectedIndex, TernarySearch.search(array, target));
    }

    @Test
    public void testExponentialSearch() {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;
        int expectedIndex = 6;
        assertEquals(expectedIndex, ExponentialSearch.search(array, target));
    }

}