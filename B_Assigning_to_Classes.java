import java.util.Arrays;
import java.util.Scanner;
public class B_Assigning_to_Classes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T--!=0) {
        scn.nextLine();
        
            int n = 2*scn.nextInt();
            scn.nextLine();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            
            Arrays.sort(arr);
            if(n!=2)
                System.out.println(arr[n/2]-arr[n/2-1]);
                else 
                System.out.println(arr[1]-arr[0]);
        }
    }
}