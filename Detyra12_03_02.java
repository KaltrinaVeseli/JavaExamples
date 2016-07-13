import javax.swing.*;
public class Detyra12_03_02 // Aplikacioni per vitin e brishte
 { public static void main(String[] args)
  { 
    String input = JOptionPane.showInputDialog("Shkruani vitin");
    int viti = new Integer(input).intValue();
    
    boolean b = (viti%4==0) && (viti%100!=0) || (viti%400==0);
   
   if ( b ) { JOptionPane.showMessageDialog(null,"Viti "+viti+" eshte vit i brishte");}
   else  {JOptionPane.showMessageDialog(null,"Viti "+viti+" nuk eshte i brishte");}
  }
 }