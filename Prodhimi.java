public class Prodhimi
{
 // product(a, b) = a * (a+1) * (a+2) * ... * b
 
 public int product(int a,int b)
 { 
   int totali=1;
  { if (a<=b) { totali = a;
                int num = a;
               
               
               while ( num!= b) 
                          { num++;
                            totali = (totali*num);
                          }
              }
  return totali;
  }
 
 
 
 
 
 }

public static void main(String[] args)
 {
  Prodhimi obj =new Prodhimi();
  System.out.println(obj.product(3,4));

 }
}