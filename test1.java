import java.io.*;

public class test1 {

    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("text.txt");

            int n = f.read();
            while (n != -1) {
                System.out.print((char) n);
                n = f.read();
            }

            FileOutputStream fo = new FileOutputStream("text.txt", true);//apend

            fo.write(("data").getBytes());  //get bytes cause it dont take string
            n = f.read();
            while (n != -1) {
                System.out.print((char) n);
                n = f.read();
            }

        } catch (Exception e) {}

    }
}