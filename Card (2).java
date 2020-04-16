
/**
 * This is the card class that creates the card objects that represent each card
 * 
 * @author Andrew Wood
 * @version 5/2/2017
 */
public class Card
{
    private String value;
    private String suit;
    /**
     * This constructor sets the vales of value and suit variables to the intital value
     */
    public Card ()
    {
        suit = "";
        value = "";
    }
    
    
    /**
     * This construcot actually fills these two fields with actual values
     */
    public Card ( String inSuit, String inValue)
    {
        value = inValue;
        suit = inSuit;
    }
    
    
    /**
     * This copy construcot makes the values of the card objects equal
     */
    public Card (Card other)
    {
        this.value = other.value;
        this.suit = other.suit;
    }
    
    
    /**
     * Returns the actual string value of the card
     * @return string value returns the string value of the card
     */
    public String getValue ()
    {
        return value;
    }
    
    
    /**
     * Returns the suit value of the card
     * @return string suit returns the value of the suit of the card
     */
    public String getSuit ()
    {
        return suit;
    }
    
    
    /**
     * This method is a tostring method that retuns the textual representation of the suit and value of the cards
     * @return string value and suit string values 
     */
    public String toString ()
    {
        return value + suit;
    }

}
