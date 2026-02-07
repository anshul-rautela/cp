import java.util.Scanner;

public class A_Twin_Permutations {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while (t-- != 0) {
            scn.nextLine();
            int n = scn.nextInt();
            for(int i =0;i<n;i++){
                int k = scn.nextInt();
                System.out.print(n+1-k+" ");
            }
        System.out.println();
        }
    }
}