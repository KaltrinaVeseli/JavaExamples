public class Sinusi
/** sine calculates the sine value of its argument, using the formula
*   sin(x) = x - (x^3/3!) + (x^5/5!) - (x^7/7!) + ... - (x^n/19!)
*   @param x - the value, in radians, whose sine is desired
*   (i.e., sine(0)=0, sine(pi/2)=1, sine(pi)=0, sine(3pi/2)=-1, etc.)
*   @return the sine as calculated by the formula */
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
  
 public double sine(double x)
 
{ double sin = x;
  int count = 3;
  while ( count <= 19 )
        
        { double d = Math.pow(x, count) / factorial(count); 
          if ( (count % 4) == 3 )
               { sin = sin - d; }
          else { sin = sin + d; }
          count = count + 2;
        }
  return sin;
}

 public static void main(String[] args)
 {
  Sinusi obj = new Sinusi();
  System.out.println(obj.sine(1));
 
 }
 
}