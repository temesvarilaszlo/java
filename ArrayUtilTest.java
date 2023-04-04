package array.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArrayUtilTest
{
    @Test
    public void testmaxlength0_1()
    {
        int[] a = new int[0];
        assertEquals(0, ArrayUtil.max(a));
    }

    @Test
    public void testmaxlength0_2()
    {
        int[] a = new int[0];
        assertEquals(0, ArrayUtil.max2(a));
    }

    @Test
    public void testmaxlength0_3()
    {
        int[] a = new int[0];
        assertEquals(0, ArrayUtil.max3(a));
    }

    @Test
    public void testmaxlength0_4()
    {
        int[] a = new int[0];
        assertEquals(0, ArrayUtil.max4(a));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
    1, [1]
    -547, [-547]
    34, [34]
    """)
    public void testmaxlength1_1(int expectedmax, int[] a)
    {
        assertEquals(expectedmax, ArrayUtil.max4(a));
    }

}