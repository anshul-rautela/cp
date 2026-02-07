import java.util.Arrays;
import java.util.Scanner;

public class A_Restoring_Three_Numbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 4;

        int arr[]  = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        Arrays.sort(arr);

        for(int i =0;i<3;i++){
            System.out.print(arr[3]-arr[i]+" ");
        }
    }
}