public class Detyra7_7_4
{
 public static void pattern()
 {
  for ( int i = 0; i <= 3; i++ ){
   for ( int j = 3; j >= i; j-- ){
  
   System.out.print(i +""+ j+" " );
 
   }
  System.out.println("");
  }
   
 }
 public static void main(String[] args)
 {
  pattern(); 
  
 }
}