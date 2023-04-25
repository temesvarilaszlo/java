package data.structure;

import java.util.*;

public class MultiSet<E>
{
    private HashMap<E, Integer> elemToCount;

    @SafeVarargs
    public MultiSet(E... elems)
    {
        for (E e : elems)
        {
            this.add(e);
        }
    }

    public void add(E e)
    {
        if (elemToCount.containsKey(e))
        {
            elemToCount.put(e, elemToCount.get(e) + 1);
        }
        else elemToCount.put(e, 1);
    }

    public int getCount(E e)
    {
        return 0;
    }

    public MultiSet<E> intersect(MultiSet<E> set)
    {
        return set;
    }

    public int size()
    {
        return 0;
    }
}