
/**
 * This is the main method where the game is being played, using the other classes
 * @author Andrew Wood 
 * @version 5/2/2017
 */
public class ClockGame
{
 public static void main (String [] args){
       int win = 0; //tWin counter
    
         //Loops through silent,verbose, and default 
   for(int n = 0 ; n < Integer.parseInt(args[1]); n++){
        
      //Command line command prompt game mode
      if(args[0].equals("silent")){
        
        Deck dOC = new Deck(); 

        Card hand; //Iholds the value of the card that will be removed
        dOC.shuffle();
        
        boolean winner = false; 
        boolean loser = false;
        
        //These are the piles of the game
                    Pile pile1 = new Pile();
                    Pile pile2 = new Pile();
                    Pile pile3 = new Pile();
                    Pile pile4 = new Pile();
                    Pile pile5 = new Pile();
        
        Pile pile6 = new Pile();
        Pile pile7 = new Pile();
        Pile pile8 = new Pile();
        Pile pile9 = new Pile();
        
                    Pile pile10 = new Pile();
                    Pile pile11 = new Pile();
                    Pile pile12 = new Pile();
                    Pile pile13 = new Pile();
        
        //Fills the piles with 4 cards
        for (int i = 0; i < 4; i++)
        {
                pile1.addCardFaceDown(dOC.dealCard());
                pile2.addCardFaceDown(dOC.dealCard());
                pile3.addCardFaceDown(dOC.dealCard());
                pile4.addCardFaceDown(dOC.dealCard());
                pile5.addCardFaceDown(dOC.dealCard());
                pile6.addCardFaceDown(dOC.dealCard());
                pile7.addCardFaceDown(dOC.dealCard());
                pile8.addCardFaceDown(dOC.dealCard());
                pile9.addCardFaceDown(dOC.dealCard());
                pile10.addCardFaceDown(dOC.dealCard());
                pile11.addCardFaceDown(dOC.dealCard());
                pile12.addCardFaceDown(dOC.dealCard());
                pile13.addCardFaceDown(dOC.dealCard());
        }

        hand = new Card(pile13.removeCard());
            //checking that the card is in the hand. 
         
           if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());                 
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());  
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard()); 
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard()); 
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());  
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());  
            }
           else if(hand.getValue()== "K"){
                pile13.addCardFaceUp(hand);
                hand = new Card (pile13.removeCard());
            }
        
        while (!loser && !winner){
                if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());  
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard());
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard());
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());
            }
            else if(hand.getValue()== "K"){ 
                pile13.addCardFaceUp(hand);
                    if(pile13.getNumberOfFaceUp() < 4){
                            hand = new Card (pile13.removeCard());

                    }
               
            }
            
            //winning if else statements
            if(pile1.getNumberOfFaceUp() == 4 && 
            pile2.getNumberOfFaceUp() == 4 && 
            pile3.getNumberOfFaceUp() == 4 && 
            pile4.getNumberOfFaceUp() == 4 && 
            pile5.getNumberOfFaceUp() == 4 && 
            pile6.getNumberOfFaceUp() == 4 && 
            pile7.getNumberOfFaceUp() == 4 && 
            pile8.getNumberOfFaceUp() == 4 && 
            pile9.getNumberOfFaceUp() == 4 && 
            pile10.getNumberOfFaceUp() == 4 && 
            pile11.getNumberOfFaceUp() == 4 && 
            pile12.getNumberOfFaceUp() == 4 && 
            pile13.getNumberOfFaceUp() == 4) 
                {
                win++;
                winner = true;
                
                
                }
            else if (pile13.getNumberOfFaceUp() >= 4)
                {
                loser = true;
    
                 }
        }
       
           }
       //the code below is exactly the same as the one above besides all of the new print statements that are being used because this command line argument is verbose  
      else if(args[0].equals("verbose")){
       
        Deck dOC = new Deck();
        Card hand;
        dOC.shuffle();
        boolean winner = false;
        boolean loser = false;
        
        Pile pile1 = new Pile();
        Pile pile2 = new Pile();
        Pile pile3 = new Pile();
        Pile pile4 = new Pile();
        Pile pile5 = new Pile();
        Pile pile6 = new Pile();
        Pile pile7 = new Pile();
        Pile pile8 = new Pile();
        Pile pile9 = new Pile();
        Pile pile10 = new Pile();
        Pile pile11 = new Pile();
        Pile pile12 = new Pile();
        Pile pile13 = new Pile();

        System.out.print("\nDeck: " + dOC);
        System.out.println();
        
        //Fills the piles with cards
        for (int i = 0; i < 4; i++){
            pile1.addCardFaceDown(dOC.dealCard());
            pile2.addCardFaceDown(dOC.dealCard());
            pile3.addCardFaceDown(dOC.dealCard());
            pile4.addCardFaceDown(dOC.dealCard());
            pile5.addCardFaceDown(dOC.dealCard());
            pile6.addCardFaceDown(dOC.dealCard());
            pile7.addCardFaceDown(dOC.dealCard());
            pile8.addCardFaceDown(dOC.dealCard());
            pile9.addCardFaceDown(dOC.dealCard());
            pile10.addCardFaceDown(dOC.dealCard());
            pile11.addCardFaceDown(dOC.dealCard());
            pile12.addCardFaceDown(dOC.dealCard());
            pile13.addCardFaceDown(dOC.dealCard());
        }
        //Piles have been filled and are being shown
        System.out.println("Pile 1: " +  pile1.toString());
        System.out.println("Pile 2: " +  pile2.toString());
        System.out.println("Pile 3: " +  pile3.toString());
        System.out.println("Pile 4: " +  pile4.toString());
        System.out.println("Pile 5: " +  pile5.toString());
        System.out.println("Pile 6: " +  pile6.toString());
        System.out.println("Pile 7: " +  pile7.toString());
        System.out.println("Pile 8: " +  pile8.toString());
        System.out.println("Pile 9: " +  pile9.toString());
        System.out.println("Pile 10: " +  pile10.toString());
        System.out.println("Pile 11: " +  pile11.toString());
        System.out.println("Pile 12: " +  pile12.toString());
        System.out.println("Pile 13: " +  pile13.toString());

        hand = new Card(pile13.removeCard());//remove card
        //SHowing the cards that are being drawn
           if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                 
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
           else if(hand.getValue()== "K"){
                pile13.addCardFaceUp(hand);
                hand = new Card (pile13.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
        
        while (!loser && !winner){
                if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
                System.out.println("Pile 1: " +  pile1.toString()); 
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
                System.out.println("Pile 2: " +  pile2.toString());
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit()); 
                System.out.println("Pile 3: " +  pile3.toString()); 
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit()); 
                System.out.println("Pile 4: " +  pile4.toString());
                
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit()); 
                System.out.println("Pile 5: " +  pile5.toString());
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                System.out.println("Pile 6: " +  pile6.toString());   
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
                System.out.println("Pile 7: " +  pile7.toString());
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                System.out.println("Pile 8: " +  pile8.toString()); 
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                System.out.println("Pile 9: " +  pile9.toString());   
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                System.out.println("Pile 10: " +  pile10.toString());  
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit()); 
                System.out.println("Pile 11: " +  pile11.toString()); 
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                System.out.println("Pile 12: " +  pile12.toString());  
            }
            else if(hand.getValue()== "K"){
                pile13.addCardFaceUp(hand);
                    if(pile13.getNumberOfFaceUp() < 4){
                            hand = new Card (pile13.removeCard());
                        System.out.println("You drew a : " + hand.getValue() + hand.getSuit());
                        System.out.println("Pile 13: " +  pile13.toString());  
                    }
               
            }
            
            if(pile1.getNumberOfFaceUp() == 4 && 
            pile2.getNumberOfFaceUp() == 4 && 
            pile3.getNumberOfFaceUp() == 4 && 
            pile4.getNumberOfFaceUp() == 4 && 
            pile5.getNumberOfFaceUp() == 4 && 
            pile6.getNumberOfFaceUp() == 4 && 
            pile7.getNumberOfFaceUp() == 4 && 
            pile8.getNumberOfFaceUp() == 4 && 
            pile9.getNumberOfFaceUp() == 4 && 
            pile10.getNumberOfFaceUp() == 4 && 
            pile11.getNumberOfFaceUp() == 4 && 
            pile12.getNumberOfFaceUp() == 4 && 
            pile13.getNumberOfFaceUp() == 4) 
                {
                win++;
                winner = true;
                System.out.println("You won!");
                
                }
            else if (pile13.getNumberOfFaceUp() >= 4)
                {
               System.out.println("You lost!");
                loser = true;
    
                 }
        }       
               
       }
       else{ //default game
       
        Deck dOC = new Deck();
        Card hand;
        dOC.shuffle();
        boolean winner = false;
        boolean loser = false;
        
        Pile pile1 = new Pile();
        Pile pile2 = new Pile();
        Pile pile3 = new Pile();
        Pile pile4 = new Pile();
        Pile pile5 = new Pile();
        Pile pile6 = new Pile();
        Pile pile7 = new Pile();
        Pile pile8 = new Pile();
        Pile pile9 = new Pile();
        Pile pile10 = new Pile();
        Pile pile11 = new Pile();
        Pile pile12 = new Pile();
        Pile pile13 = new Pile();
        
        //filling up
        for (int i = 0; i < 4; i++){
            pile1.addCardFaceDown(dOC.dealCard());
            pile2.addCardFaceDown(dOC.dealCard());
            pile3.addCardFaceDown(dOC.dealCard());
            pile4.addCardFaceDown(dOC.dealCard());
            pile5.addCardFaceDown(dOC.dealCard());
            pile6.addCardFaceDown(dOC.dealCard());
            pile7.addCardFaceDown(dOC.dealCard());
            pile8.addCardFaceDown(dOC.dealCard());
            pile9.addCardFaceDown(dOC.dealCard());
            pile10.addCardFaceDown(dOC.dealCard());
            pile11.addCardFaceDown(dOC.dealCard());
            pile12.addCardFaceDown(dOC.dealCard());
            pile13.addCardFaceDown(dOC.dealCard());
        }
       
        hand = new Card(pile13.removeCard());
        
           if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
                 
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit()); 
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
           else if(hand.getValue()== "K"){
                pile13.addCardFaceUp(hand);
                hand = new Card (pile13.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
        
        while (!loser && !winner){
                if(hand.getValue() == "A"){
                pile1.addCardFaceUp(hand);
                hand = new Card (pile1.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue() == "2"){
                pile2.addCardFaceUp(hand);
                hand = new Card (pile2.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "3"){
                pile3.addCardFaceUp(hand);
                hand = new Card (pile3.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "4"){
                pile4.addCardFaceUp(hand);
                hand = new Card (pile4.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "5"){
                pile5.addCardFaceUp(hand);
                hand = new Card (pile5.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "6"){
                pile6.addCardFaceUp(hand);
                hand = new Card (pile6.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "7"){
                pile7.addCardFaceUp(hand);
                hand = new Card (pile7.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "8"){
                pile8.addCardFaceUp(hand);
                hand = new Card (pile8.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "9"){
                pile9.addCardFaceUp(hand);
                hand = new Card (pile9.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "10"){
                pile10.addCardFaceUp(hand);
                hand = new Card (pile10.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "J"){
                pile11.addCardFaceUp(hand);
                hand = new Card (pile11.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "Q"){
                pile12.addCardFaceUp(hand);
                hand = new Card (pile12.removeCard());
                System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
            }
            else if(hand.getValue()== "K"){
                pile13.addCardFaceUp(hand);
                    if(pile13.getNumberOfFaceUp() < 4){
                            hand = new Card (pile13.removeCard());
                        System.out.println("You drew a : " + hand.getValue() + hand.getSuit());  
                    }
               
            }
            
            if(pile1.getNumberOfFaceUp() == 4 && 
            pile2.getNumberOfFaceUp() == 4 && 
            pile3.getNumberOfFaceUp() == 4 && 
            pile4.getNumberOfFaceUp() == 4 && 
            pile5.getNumberOfFaceUp() == 4 && 
            pile6.getNumberOfFaceUp() == 4 && 
            pile7.getNumberOfFaceUp() == 4 && 
            pile8.getNumberOfFaceUp() == 4 && 
            pile9.getNumberOfFaceUp() == 4 && 
            pile10.getNumberOfFaceUp() == 4 && 
            pile11.getNumberOfFaceUp() == 4 && 
            pile12.getNumberOfFaceUp() == 4 && 
            pile13.getNumberOfFaceUp() == 4) {
                win++;
                winner = true;
                System.out.println("You Won!"); 
            }
            else if (pile13.getNumberOfFaceUp() >= 4){
               System.out.println("You Lost!");
                loser = true;
    
            }
        } 
        }
              
}
    System.out.print("You won " + win + " games"); 
    }
}
   
    
    


