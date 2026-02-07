import java.util.Scanner;

public class A_Required_Remainder {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int x = scn.nextInt();
            int y = scn.nextInt();
            int n = scn.nextInt();
            
            int rem = n%x;
            if(rem == y)    System.out.println(n);
            else if(y>rem)  System.out.println(n-rem-x+y);
            else System.out.println(n-rem+y);

        }
    }
}