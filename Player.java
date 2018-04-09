import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    String name;
    public static int money;
    Card card;
    int handTotal;
    public static boolean bust;
    public static int bet;
    Scanner scan = new Scanner(System.in);
    ArrayList<Card> currentHand = new ArrayList<Card>();
    public Player(String nm, int m)
    {
        this.name=nm;
        this.money=m;
    }
    public static void bet(int bet){
        if(bet<money){
            money-= bet;
        }
        else{
            System.out.println("Nope, you don't have the money.");
        }
    }
    public void hit(Card c){
         currentHand.add(c);
    }
    public boolean stay(){
        System.out.println("Stay? y/n");
        String hit = scan.next();
        if (hit.equals("y")) return true;
        else return false;
    }
    public void updateWinnings(){
        money+=2*bet;
    }
    public int handTotal(ArrayList<Card> hand){
        for(Card c : hand){
            handTotal+=Card.value; 
            if((Card.rank).equals("ace")&&handTotal>21){
                handTotal-=10;
                }
            if(handTotal>21){
                bust=true;
            }
        }
        return handTotal;
    }
    public String busted(boolean bust){
        if(bust==true){
            return "BUST";
        }
        return null;
    }
    public String toString(int[] hand){
        return " ";
    }
}
