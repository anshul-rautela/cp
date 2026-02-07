import java.util.Scanner;

public class B_Chocolates {

    public static void main(String[] args) {
        Scanner  scn = new Scanner(System.in);
        int n  = scn.nextInt();
        scn.nextLine();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        int maxi = -1;
        long sum = arr[n-1];
        int prev = arr[n-1];
        for(int i = n-2;i>=0;i--){
            int curr = arr[i];
            int k = Math.min(curr,prev-1);
            k = Math.max(0, k);
                sum+=k;
                prev = k;
            
        }
        System.out.println(sum);
    }
}