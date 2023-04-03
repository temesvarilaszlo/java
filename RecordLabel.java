package music.recording;

public class RecordLabel
{
    private final String name;
    private int cash;

    public RecordLabel(String name, int cash)
    {
        this.name = name;
        this.cash = cash;
    }

    public String getName()
    {
        return name;
    }

    public int getCash()
    {
        return cash;
    }

    public void gotIncome(int gotIncome)
    {
        cash += gotIncome;
    }

    public String toString()
    {
        return name;
    }
}