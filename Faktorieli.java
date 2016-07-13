public class Faktorieli
/** 0! = 1
    n! = 1 * 2 * ... * n, for positive n */
{
 public long factorial(int i)
 {
  long totali = 1;
  
  
  if(i>0) {
            while (i != 0) {
                            totali=totali*i;
                            i--;
                           }
      
          
          
          }
  
  
  else if (i<0){ System.out.println("Gabim"); }
 
  return totali;
 }
 public static void main(String[] args)
 {
  Faktorieli obj=new Faktorieli();
  System.out.println(obj.factorial(6));
 
 }



}