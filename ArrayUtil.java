package array.util;

public class ArrayUtil
{
    public ArrayUtil(){}

    public static int max(int[] array)
    {
        if (array.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    public static int max2(int[] array)
    {
        if (array.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        for (int i : array)
        {
            max = i > max ? i : max;
        }
        return max;
    }

    public static int max3(int[] array)
    {
        if (array.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        for (int i : array)
        {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int max4(int[] array)
    {
        if (array.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        for (int i : array)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }

    public static int[] minMax(int[] array)
    {
        if (array.length == 0) return new int[]{};
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array)
        {
            max = i > max ? i : max;
            min = i < min ? i : min;
        }
        return new int[]{min, max};
    }
}