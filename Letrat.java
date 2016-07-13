import javax.swing.*;
public class Letrat {
  public static void main(String[] args) {
    int[] deck = new int[52];
   // String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

  
   int n = new Integer(JOptionPane.showInputDialog("Jepni numrin e lojtareve:")).intValue();

    // Display the all the cards
   
   
      for ( int a = 1; a <= n; a++ )
      { 
          System.out.println("Per lojtarin"+ a);
          //System.out.println( rank + " of " + suit);

 
    for (int i = 0; i < 5; i++) {
    //  String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      
      //System.out.println("Per lojtarin 1"); 
      System.out.println(rank);
         }
   // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }
 
  }
  
  }
}