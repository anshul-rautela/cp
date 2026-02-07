import java.util.*;

public class B_Blackslex_and_Showering {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- != 0) {
            int n = scn.nextInt();
            scn.nextLine();
            int arr[] = new int[n];
            int sum = 0;
            int maxi = Integer.MIN_VALUE;

            int maxind = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                if(i==0){
                    maxi = Math.max(maxi, Math.abs(arr[i+1]-arr[i]));
                }else if(i == n-1){
                    if(maxi < Math.abs(arr[i-1]-arr[i])){
                        maxind = n-1;    
                        maxi = Math.abs(arr[i-1]-arr[i]);
                    }
                }
                else{
                    if(maxi < Math.abs(arr[i-1]-arr[i])+Math.abs(arr[i+1]-arr[i-1])+Math.abs(arr[i+1]-arr[i])){
                        maxind = i;    
                        maxi = Math.abs(arr[i-1]-arr[i])+Math.abs(arr[i+1]-arr[i-1])+Math.abs(arr[i+1]-arr[i]);
                    }
                }
            }
            int arr2[] = new int[n - 1];
            System.out.println(maxind);
            for (int i = 0; i < n; i++) {
                if (maxind > i)
                    arr2[i] = arr[i];
                else if (maxind < i)
                    arr2[i - 1] = arr[i];
            }
            for (int i = 0; i < n - 2; i++) {
                // System.out.println(arr2[i]);
                sum += Math.abs(arr2[i] - arr2[i + 1]);
            }

            System.out.println(sum);
        }
    }
}