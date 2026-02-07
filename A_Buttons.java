import java.util.*;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            if(c%2!=0) a++;

            if(a>b) System.out.println("First");
            else System.out.println("Second");
        }
    }
}