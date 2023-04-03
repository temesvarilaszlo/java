package music.recording;

public class Artist
{
    private final String name;
    private final RecordLabel label;

    public Artist(String name, RecordLabel label)
    {
        this.name = name;
        this.label = label;
    }

    public String getName()
    {
        return name;
    }

    public RecordLabel getLabel()
    {
        return label;
    }

    public String toString()
    {
        return "%s@%s".formatted(name, label.toString());
    }
}
