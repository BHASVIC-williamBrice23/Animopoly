import java.util.ArrayList;
import java.util.Random;


public class Card {
    public String Output;
    public int ChangeMoney;
    public Card(String newOutput, int newChangeMoney){
        Output = newOutput;
        ChangeMoney = newChangeMoney;
    }
    public static Card[] deck= new Card[20];
    public static Card[] Cards(){
        deck[0]=(new Card("Bank error in your favour. COLLECT 200", 200));
        deck[1]=(new Card("Doctor’s fee. LOSE 50", -50));
        deck[2]=(new Card("Your car has broken down. LOSE 100", -100));
        deck[3]=(new Card("Its your birthday. COLLECT 50", 50));
        deck[4]=(new Card("You have won a beauty contest. COLLECT 100", 100));
        deck[5]=(new Card("Parking fine. LOSE 25", -25));
        deck[6]=(new Card("You are fined for avoiding taxes. LOSE 200", -200));
        deck[7]=(new Card("You star in a big opera show. COLLECT 200", 200));
        deck[8]=(new Card("You inherit a big fortune COLLECT 300", 300));
        deck[9]=(new Card("There is a small fire in your home. LOSE 250", -250));
        deck[10]=(new Card("Speeding fine. LOSE 50", -50));
        deck[11]=(new Card("Income tax refund. COLLECT 50", 50));
        deck[12]=(new Card("Life insurance matures. COLLECT 100", 100));
        deck[13]=(new Card("You have won a crossword competition. COLLECT 100", 100));
        deck[14]=(new Card("One of your animal enclosures is in need of repairs. LOSE 150", -150));
        deck[15]=(new Card("High water bill. LOSE 100", -100));
        deck[16]=(new Card("Your failed opera show leaves you in disgrace. LOSE 200", -150));
        deck[17]=(new Card("You win a 100m sprint. COLLECT 100", 100));
        deck[18]=(new Card("You lose a bet on a racehorse. LOSE 150", -150));
        deck[19]=(new Card("There is an increase in the price of pet food. LOSE 100", -100));
        return deck;
    }

    public static Card RandCard(){
        Random rand = new Random();
        int random_int = rand.nextInt(20);
        return deck[random_int];
    }

}
