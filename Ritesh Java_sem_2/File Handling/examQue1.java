import java.io.*;
import java.util.Scanner;

public class examQue1 {
    public static void main(String[] args) {
        Reader r;
        try{
            r = new FileReader("ABC.txt");
            try {
                examQue1.check(r);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

    public static void check(Reader r) throws Exception{
        int chars = 0, spaces = 0, lines = 0;
        int c = r.read();
        while(c != -1) {
             
             System.out.print(c);
             chars++;
             if ((char)c == '\n') {
                 lines++;
             } else if ((char)c == ' ') {
                 spaces++;
             }
             c = r.read();

         }
        System.out.println("characters : " + chars);
        System.out.println("spaces : " + spaces);
        System.out.println("lines : " + lines);
    }
}