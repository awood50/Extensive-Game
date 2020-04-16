import java.util.*;
/**
 * This class creates the deck holding the suits and values fo the cards
 * @author  Andrew Wood 
 * @version 5/2/2017
 */
public class Deck
{
    private int numberOfDealt;
    private Card [] dOC;
    Random rand = new Random ();  
    /**
     * Constructor method to set intial values for card fields
     */
    public Deck ()
    {
        numberOfDealt = 0;
        
        dOC = new Card [52];
        //These are the diamond values
        dOC [0] = new Card ("D", "2");
        dOC [1] = new Card ("D", "3");
        dOC [2] = new Card ("D", "4");
        dOC [3] = new Card ("D", "5");
        dOC [4] = new Card ("D", "6");
        dOC [5] = new Card ("D", "7");
        dOC [6] = new Card ("D", "8");
        dOC [7] = new Card ("D", "9");
        dOC [8] = new Card ("D", "10");
        dOC [9] = new Card ("D", "J");
        dOC [10] = new Card ("D", "Q");
        dOC [11] = new Card ("D", "K");
        dOC [12] = new Card ("D", "A");
        
        
        //These are the club values
        dOC [13] = new Card ("C", "2");
        dOC [14] = new Card ("C", "3");
        dOC [15] = new Card ("C", "4");
        dOC [16] = new Card ("C", "5");
        dOC [17] = new Card ("C", "6");
        dOC [18] = new Card ("C", "7");
        dOC [19] = new Card ("C", "8");
        dOC [20] = new Card ("C", "9");
        dOC [21] = new Card ("C", "10");
        dOC [22] = new Card ("C", "J");
        dOC [23] = new Card ("C", "Q");
        dOC [24] = new Card ("C", "K");
        dOC [25] = new Card ("C", "A");
        
        
        //These are the heart values
        dOC [26] = new Card ("H", "2");
        dOC [27] = new Card ("H", "3");
        dOC [28] = new Card ("H", "4");
        dOC [29] = new Card ("H", "5");
        dOC [30] = new Card ("H", "6");
        dOC [31] = new Card ("H", "7");
        dOC [32] = new Card ("H", "8");
        dOC [33] = new Card ("H", "9");
        dOC [34] = new Card ("H", "10");
        dOC [35] = new Card ("H", "J");
        dOC [36] = new Card ("H", "Q");
        dOC [37] = new Card ("H", "K");
        dOC [38] = new Card ("H", "A");
        
        
        //These are the spade values
        dOC [39] = new Card ("S", "2");
        dOC [40] = new Card ("S", "3");
        dOC [41] = new Card ("S", "4");
        dOC [42] = new Card ("S", "5");
        dOC [43] = new Card ("S", "6");
        dOC [44] = new Card ("S", "7");
        dOC [45] = new Card ("S", "8");
        dOC [46] = new Card ("S", "9");
        dOC [47] = new Card ("S", "10");
        dOC [48] = new Card ("S", "J");
        dOC [49] = new Card ("S", "Q");
        dOC [50] = new Card ("S", "K");
        dOC [51] = new Card ("S", "A");
    }
    
   
     /**
     * Deals out the cards in this method
     */
    public Card dealCard()
    {
        Card temp = new Card (dOC[0]);
            numberOfDealt++;
        for(int i = 0; i <51; i++)
            {
            dOC[i] = new Card (dOC[i + 1]);
            
            }
        
        
            
        //returns a new temporary card     
        dOC[51] = new Card ("", "");
        return new Card(temp);
    }   
    
    /**
     * Method that returns the number of cards left
     * @return int number of cards left
     */
    public int cardsLeft()
    {
       return (52 - numberOfDealt);
    }
    
    /**
     * Tostring method that returns the textual represenation of the cards
     * @return string returns the string value
     */
    public String toString()
    {
        String dOCToString = "";
       
        
        for(int k = 0; k < dOC.length; k++)
            {
                dOCToString += dOC[k].toString() + " ";
            }
        return dOCToString;
    }
    
    /**
     * Method that shuffles the order of the cards
     * @return int the number of cards left shuffled
     */
    public void shuffle ()
    {
        //loops through and swaps 2 random cards
        for (int j = 0; j < 1000; j++)
        {
            int number1 = rand.nextInt(52);//first card
            int number2 = rand.nextInt(52);//second card
            
            Card temp = dOC [number1];
            dOC [number1] = dOC [number2];
            dOC [number2] = temp;
        }
    }
}
