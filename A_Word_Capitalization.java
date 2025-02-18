import java.util.Scanner;

public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s2= s.substring(0, 1).toUpperCase()+s.substring(1, s.length());
        System.out.println(s2);
        
    }
}