import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_We_Need_the_Zero {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int  n = scn.nextInt();

            scn.nextLine();
            int sol =0;
            for(int i =0;i<n;i++){
                int k = scn.nextInt();
                sol^=k;
            }
            if(sol==0||n%2!=0)
                System.out.println(sol);
            else System.out.println(-1);
            }
    }
}