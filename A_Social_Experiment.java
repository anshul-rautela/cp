import java.util.Scanner;

public class A_Social_Experiment {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n  = scn.nextInt();
            // else if(n%2==0||n%3==0) System.out.println(0);
            // else 
                if(n<=3) System.out.println(n);
            else if(n%2==0) System.out.println(0);
                else System.out.println(1);
        }
    }
}