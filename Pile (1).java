
/**
 * Holds the information to create the card piles in the clock solitaire game
 * 
 * @author Andrew Wood
 * @version 5/2/2017
 */
public class Pile
{
    // instance variables - replace the example below with your own
    private Card[] cardPile;
    private int numberUp;
    private String pileString;
    private String uDownString;
 
    

    /**
     * Constructing the objects for the pile
     */
    public Pile()
    {
        //variables are intitialized
        cardPile = new Card[5];
        for(int i = 0; i < cardPile.length; i++)
        {
            cardPile[i] = new Card();
        }
        numberUp = 0;

    }

    /**
     * Addds facedown card to pile
     * @param  card the card object is for the face down cards
     * 
     */
    public void addCardFaceDown(Card card)
    {
      for(int i =0; i < 4; i++){
              if(cardPile[i].getValue() == "")
              {
              cardPile[i] = new Card (card);
              i = 4;
              }
        }
    }
    
    /**
     * Returns the top face down card
     *  return left reference to a Card object
     */
    public Card removeCard()
    {
   
        Card left = new Card(cardPile[0]);
        
        for (int i = 0; i < 4; i++)
        {
            cardPile[i] = new Card (cardPile[i + 1]);
        }
        
        return left;
        
    }
    
    /**
     * Returns the number of face down cards
     * @return int face down cards
     */
    public int getNumberOfFaceDown()
        {
        return (4 - numberUp);
    }
    
    /**
     * Add a face up card to the bottom
     * @param card object reference
     */
    public void addCardFaceUp(Card card)
    {
        cardPile[4] =  new Card(card);
        numberUp++; //adds card to bottom of array
    }
    
    /**
     * Returns the number of face up cards
     * @return int face up cards
     */
    public int getNumberOfFaceUp(){
      return numberUp;
    }
    
    /**
     * ToString checks and prints out the textual representations of the cards
     * @return string string of the cards
     */
    public String toString()
    {
        String print = "Face Down Cards: ";
        for(int i = cardPile.length - 1; i > numberUp - 1; i--)
        {
            if(cardPile[i] != null)
            {
                print += cardPile[i] + " ";
            }
        }  
        print += "\nFace up: ";
        
        for(int i = 0; i < numberUp; i++)
        {
            print += cardPile[i] + " ";
          }
        
        return print;
           
    }
    
}
