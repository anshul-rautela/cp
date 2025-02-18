import java.util.Scanner;

public class A_Minimal_Coprime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt();
            int m = scn.nextInt(); scn.nextLine();
            if(n==1&&m==1)
            System.out.println(1);
            else System.out.println(m-n);

        }
    }
}