import java.awt.*;
import javax.swing.*;
public class Chess extends JPanel
{ 
 public void paint(Graphics g)
   {
      int row;
      int col;
      int x;
      int y;
      int square_size=50;

      for ( row = 0;  row < 8;  row++ )
      {
         for ( col = 0;  col < 8;  col++)
         {
            x = col * square_size;
            y = row * square_size;
             if ( (row % 2) == (col % 2) )
               g.setColor(Color.WHITE);
            else
               g.setColor(Color.BLACK);

            g.fillRect(x, y,square_size, square_size);
         }
      }
   }
}
  