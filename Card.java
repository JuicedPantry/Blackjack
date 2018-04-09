public class Card
{
    public static int value;
    public static String suit;
    public static String rank;
    public Card(int val, String s, String r)
    {
        this.value=val;
        this.suit=s;
        this.rank=r;
    }
    public String getSuit(){
        return this.suit;
    }
    public String getRank(){
        return this.rank;
    }
    public String toString(){
        return "Suit: " + this.suit + " Rank: " + this.rank + " Value: " + this.value;
    }
}
