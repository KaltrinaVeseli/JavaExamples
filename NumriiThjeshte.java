public class NumriiThjeshte
{
 public static void main(String[] args)
 {
  int[] num = new int[51];

   for (int i = 1; i < num.length; i++) {
      num[i] = i;
  //  System.out.println(num[i]);
     for ( int j = 2 ; j < num.length; j++ ){
       
       if ( num[i]== j ) { System.out.println(num[i]); }
        
        else if ( num[i]%j==0 ) { break; }
     
     
     }
    }

  
  
  }

}
