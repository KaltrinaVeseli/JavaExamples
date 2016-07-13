import javax.swing.*;
public class TestChess{
 public static void main(String args[]) {
       Chess obj = new Chess();
        JFrame f = new JFrame();
        f.getContentPane().add(obj);
        f.setSize(500,500);
        f.setTitle("CheckerBoard");    
        f.setVisible(true);
    }
 }
