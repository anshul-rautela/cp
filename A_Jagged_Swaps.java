import java.util.Scanner;

public class A_Jagged_Swaps {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t  = scn.nextInt();
            scn.nextLine();
                while (t--!=0) {
            int n = scn.nextInt();
            scn.nextLine();
            int k = scn.nextInt();
            scn.nextLine();
            if(k==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}