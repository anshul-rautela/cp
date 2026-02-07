import java.util.Scanner;
import java.util.*;
public class B_Number_Circle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        scn.nextLine();
        Long arr[]= new Long[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextLong();
        }

        Arrays.sort(arr);
        Long temp = arr[n-1];
        arr[n-1] = arr[n-2];
        arr[n-2] = temp;

       

        if(arr[n-2]<arr[n-1]+arr[n-3]){
            System.out.println("YES");
            for(int i =0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else System.out.println("NO");

    }   
}
