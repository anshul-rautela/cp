import java.util.Scanner;

public class B_Prefix_Max {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n  = scn.nextInt();
            int arr[] = new int[n];
            scn.nextLine();
            int maxi = Integer.MIN_VALUE;
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
                maxi = Math.max(maxi,arr[i]);
            }
            System.out.println(maxi*n);
        
        }
    }
}