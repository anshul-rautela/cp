import java.util.Scanner;

public class A_Two_Permutations {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();
            
            if(a==b&&b==n) System.out.println("Yes");
            else if(a+b<n-1) System.out.println("Yes");
            else System.out.println("No");

        }


    }
}