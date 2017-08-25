package prog.kiev.ua.homework.Text;

import java.io.*;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public class FRdemo  {
    public static void main(String[] args) {

       try {
           FileWriter fw = new FileWriter("Demo.txt");
           PrintWriter pw = new PrintWriter(fw);

           pw.println("123");
           pw.println("456");
           pw.println("789");

           pw.close();

       } catch (IOException e) {
           System.out.println("ERROR");
       }



     }
}
