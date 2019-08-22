import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestFinder {

    @Test
    public void test_findMax() {
        Finder finder = new Finder();
        int[] intArray = new int[]{5,2,1,6,9};
        int expectedResult = 9;
        int actualResult = finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        int[] intArray = new int[]{5,2,1,6,9};
        int expectedResult = 1;
        int actualResult = finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void test_findMaxNull() {
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMinNull() {
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMaxEmpty() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_findMinEmpty() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(expectedResult, actualResult);
    }
}
