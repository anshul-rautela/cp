import java.util.Scanner;

public class A_Most_Unstable_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int m = scn.nextInt();
            
            if(n==1) System.out.println(0);
            else if(n==2)System.out.println(m);
            else System.out.println(m*2);
        }
    }
}