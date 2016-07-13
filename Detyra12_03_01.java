import javax.swing.*;
public class Detyra12_03_01 // Aplikacioni per perkthimin e pikeve ne note
{
 public static void main(String[] args) 
 { String input = JOptionPane.showInputDialog("Jepni numrin e pikeve");
   int nr = new Integer(input).intValue();
   
      
  switch(nr)
  {
   case 50 : case 51 :case 52:case 53 :case 54 :case 55 :case 56 :case 57 :case 58 :case 59 :{ JOptionPane.showMessageDialog(null,"Nota E"); 
   
           break;   }
             
   case 60 :case 61 :case 62 :case 63 :case 64 :case 65 :case 66 :case 67 :case 68 :case 69:{ JOptionPane.showMessageDialog(null,"Nota D"); 
           break;  }
    
   case 70: case 71:case 72: case 73:case 74:case 75:case 76:case 77:case 78:case 79:{  JOptionPane.showMessageDialog(null,"Nota C");
           break;}
   
   case 80: case 81:case 82:case 83:case 84:case 85:case 86:case 87:case 88:case 89: { JOptionPane.showMessageDialog(null,"Nota B"); 
          break;}
          
   case 90:case 91:case 92:case 93:case 94:case 95:case 96:case 97:case 98:case 99:case 100: { JOptionPane.showMessageDialog(null,"Nota A");
     break;}
     
    default : {JOptionPane.showMessageDialog(null,"Gabim");}
   }
 
 
 }

}