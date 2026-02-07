import java.util.Scanner;

public class B_Minimise_Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int mini = Integer.MAX_VALUE;
            int sum =0;
            for(int i =0;i<n;i++){
                int k = scn.nextInt();
                // System.out.print(k+" ");
                mini = Math.min(mini,k);
                // System.out.println(mini);
                sum+=mini;
                // System.out.println(sum);
            }
            System.out.println(sum);
        }


    }   
}
