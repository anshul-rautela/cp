import java.util.Scanner;

public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int x  = scn.nextInt();
            int arr[]= new int[n+1];
            scn.nextLine();
            n=n+1;
            int maxi =0;
            for(int i =0;i<n-1;i++){
                arr[i]=scn.nextInt();
                if(i>0) maxi = Math.max(maxi, arr[i]-arr[i-1]);
            }
            arr[n-1]=(x-arr[n-2])*2;
            maxi = Math.max(maxi, arr[n-1]);
            maxi = Math.max(maxi, arr[0]);
            
            System.out.println(maxi);
        }
    }
}