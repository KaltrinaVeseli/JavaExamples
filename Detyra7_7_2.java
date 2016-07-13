import javax.swing.*;
public class Detyra7_7_2 {

public static String removeDuplicateLetters(String str){
    String u="";
    int j = 0;
    for (int i=0; i<str.length()-1 ; i++){
        j = i+1;
        if(str.charAt(i)!=str.charAt(j)){
            u+=str.charAt(i);
        }

    }

    return u;
    }
    public static void main(String[] args){
        String str = JOptionPane.showInputDialog(" Jepni stringun:  ");
         JOptionPane.showMessageDialog(null, removeDuplicateLetters(str));
    
            }

}