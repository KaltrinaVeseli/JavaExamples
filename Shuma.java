public class Shuma
//summation(i) = 0 + 1 + 2 + ... + i
{
 
 
   public int summation(int i)
   {
    int totali = 0;
    int num = 0;
   while (num != i) { 
                     num = num + 1;
                     totali = totali + num;
                     
                    }
   return totali;
   
   }

 public static void main(String[] args)
 {
  Shuma obj = new Shuma();
  System.out.println(obj.summation(10));
  
 
 }

}
