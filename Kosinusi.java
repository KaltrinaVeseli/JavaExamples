public class Kosinusi
/** cosine calculates the cosine value of its parameter, using the formula
*   cosin(x) = 1 - (x^2/2!) + (x^4/4!) - (x^6/6!) + ... - (x^20/20!)
*   @param x - the value, in radians, whose cosine is desired
*   @return the cosine as calculated by the formula */
{ 
 
 public int factorial(int i)
 {
  int totali = 1;
  
  
  if(i>0) {
            while (i != 0) {
                            totali=totali*i;
                            i--;
                           }
      
        
          }
  return totali;
 }
 
 public double cosine(double x)
 {
  double cos = x;
  int count = 2;
  
  while (count<=20) {
                    
                     double d = Math.pow(x,count)/factorial(count);
                     if ((count%4)==0) { cos=cos +d;  }
                     else              { cos=cos-d;  }
                     count = count+2;
                    }
 
  return cos;
 
 
 }
 
 public static void main(String[] args)
 {
 Kosinusi obj= new Kosinusi();
 System.out.println(obj.cosine(6));
 
 }
 
}