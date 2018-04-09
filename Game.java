import java.util.ArrayList; 
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> player;
    private ArrayList<Card> dealer;
    String winner;
    public void main()
    {
        Deck deck = new Deck();
        Card c=deck.deal();
        Player pOne=new Player("Joe", 100); 
        Player pTwo = new Player("Jack", 100);
        pOne.hit(c);
        pTwo.hit(c);
        while(pOne.stay() == false){
            c = deck.deal();
            pOne.hit(c);
        }
        if(Player.bust==true){
            endGame();
        }
    }
    public void determineWinner(Player p1, Player p2){
        if(p1.handTotal > p2.handTotal){
            winner="Player 1"; 
            p1.updateWinnings();
        }
    }
    public static String endGame(){
        return "Game over";
    }
}
 