package music.fan;
import music.recording.Artist;

public class Fan
{
    private final String name;
    private final Artist favourite;
    private int moneySpent = 0;
    
    public Fan(String name, Artist favourite)
    {
        this.name = name;
        this.favourite = favourite;
    }

    public String getName()
    {
        return name;
    }

    public Artist getFavourite()
    {
        return favourite;
    }

    public int getMoneySpent()
    {
        return moneySpent;
    }

    // egyéb metódusok

    public int buyMerchandise(int price, Fan... friends)
    {
        if (friends.length == 1)
        {
            int discountedPrice = (int)Math.round(price * 0.9); 
            this.moneySpent += discountedPrice;
            favourite.getLabel().gotIncome(discountedPrice / 2);
            
            friends[0].moneySpent += discountedPrice;
            favourite.getLabel().gotIncome(discountedPrice / 2);

            return discountedPrice;
        }
        else if (friends.length >= 2)
        {
            int discountedPrice = (int)Math.round(price * 0.8);
            this.moneySpent += discountedPrice;
            favourite.getLabel().gotIncome(discountedPrice / 2);

            for(Fan f : friends)
            {
                f.moneySpent += discountedPrice;
                favourite.getLabel().gotIncome(discountedPrice / 2);
            }
            return discountedPrice;
        }
        else
        {
            this.moneySpent += price;
            favourite.getLabel().gotIncome(price / 2);
            return price;
        }
    }

    public boolean favesAtSameLabel(Fan fan2)
    {
        return this.favourite.getName() == fan2.getFavourite().getName();
    }

    public String toString1()
    {
        return "Fan(name=%s, fave=%s, spent=%d)".formatted(name, favourite.toString(), moneySpent);
    }

    public String toString2()
    {
        return "Fan(name=%s, fave=%s, spent=%d)".formatted(name, favourite.toString(), moneySpent);
    }

    public String toString3()
    {
        return "Fan(name=%s, fave=%s, spent=%d)".formatted(name, favourite.toString(), moneySpent);
    }

    public String toString4()
    {
        return "Fan(name=%s, fave=%s, spent=%d)".formatted(name, favourite.toString(), moneySpent);
    }
}