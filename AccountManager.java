import javax.swing.*;
/** AccountManager starts the application that maintains a bank account. */ 
/* Inputs: a series of commands of the forms, * D dd.cc (deposit), * W dd.cc (withdraw), or * Q (quit), where dd.cc is a dollars-cents amount * Outputs: a display of the results of the transactions */
 public class AccountManager 
 { public static void main(String[] args) 
  { // create the application’s objects:
   BankReader reader = new BankReader();
   BankAccount account = new BankAccount(0); 
   BankWriter writer = new BankWriter("BankWriter", account);
   
   String str =JOptionPane.showInputDialog("Which one are you? A , B or C-banker ? ");
   String a=str.trim();
   char b = str.charAt(0);
   
   AccountController controllerA=  new AccountController(reader, writer, account); 
     

   AccountController controllerB =  new AccountController(reader, writer, account); 
    
     
   if (b=='A' || b=='a')
   { 
      controllerA.processTransactions(); 
        
      }
      
    else if (b=='B'|| b=='b')
     {  
    
    controllerB.processTransactions();  }
                                   
                                   
    else if  (b=='c' || b== 'C') 
    { String u = JOptionPane.showInputDialog("Which account do you want to see(manage) , A or B ? ");
      
      u = u.trim();
      
      char w =u.charAt(0);
      
      if (w=='A' || w=='a')     {  
                                   controllerA.processTransactions();  }
      
      
      else if  (w=='B'|| w=='b') {  
                                    controllerB.processTransactions();  }
      
      else {JOptionPane.showMessageDialog(null,"Error in input");}
                                    
     }
 
    else { JOptionPane.showMessageDialog(null,"Error in input"); }                      
                                   
    
    }
   }