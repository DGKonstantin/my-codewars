package CountingRectangleTriangles;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ExampleTest
{
    @Test
    public void simpleCases()
    {
        assertEquals( 3,
                Solution.countRectTriang(
                        new Point[]{new Point( 1,  2), new Point( 3,  3), new Point( 4,  1),
                                new Point( 1,  1), new Point( 4, -1)}));
        assertEquals( 3,
                Solution.countRectTriang(
                        new Point[]{new Point( 1,  2), new Point( 4, -1), new Point( 3,  3),
                                new Point( 4, -1), new Point( 4,  1), new Point( 1,  1),
                                new Point( 4, -1), new Point( 4, -1), new Point( 3,  3),
                                new Point( 1,  2)}));
        assertEquals(31,
                Solution.countRectTriang(
                        new Point[]{new Point(30, 26), new Point(36,  6), new Point(12, 27),
                                new Point( 9,  8), new Point( 9, 22), new Point( 6, 35),
                                new Point(26, 40), new Point(35, 18), new Point(27,  2),
                                new Point(19, 18), new Point( 2, 41), new Point(18,  3),
                                new Point( 4, 37), new Point(13, 25), new Point(21, 34),
                                new Point(27, 45), new Point(26, 12), new Point(23, 16),
                                new Point(28,  1), new Point( 0, 25), new Point(12, 25),
                                new Point(10, 41), new Point(24, 18), new Point(31, 38),
                                new Point(28, 17), new Point( 9, 23), new Point(29,  1),
                                new Point(21, 43), new Point(20, 46), new Point(50, 10)}));
    }
}

