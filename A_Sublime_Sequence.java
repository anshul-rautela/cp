import java.util.Scanner;

public class A_Sublime_Sequence {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int k = scn.nextInt();
            if(k%2==0) System.out.println(0);
            else System.out.println(n);
        }
    }
}