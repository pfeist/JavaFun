/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoding;

/**
 *
 * @author PhilFeist
 * The purpose of this exercise is to write a simple program
 * that takes a string and reverses it.  Challenge found @
 * http://www.advogato.org/article/1043.html
 */
public class FunCoding {

    public static void main(String[] args) {
        String word = "Word";     //Word to be reversed
        int len=word.length();  // Get length of string (word)
        for (int i=len-1; i>=0; i--) {  //Loop through print cycle
            char dorw = word.charAt(i); //Get character at point i
            System.out.print(dorw); // print that shit
        }
        System.out.println( ); // extra space makes pretty output
    }
}
