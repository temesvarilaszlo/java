package famous.sequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangularTest
{
    @Test
    public void triangularTest0()
    {
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }
    @Test
    public void triangularTest1()
    {
        assertEquals(1, Fibonacci.fib(1));
    }
    @Test
    public void triangularTest10()
    {
        assertEquals(55, Fibonacci.fib(10));
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
    0, 0
    1, 1
    1, 2
    2, 3
    3, 4
    5, 5
    8, 6
    13, 7
    21, 8
    34, 9
    55, 10
    """)

    public void parameterizedTest(int expected, int n)
    {
        assertEquals(expected, Fibonacci.fib(n));
    }
}