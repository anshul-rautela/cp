import java.util.Arrays;
import java.util.Scanner;

public class A_Minimal_Square {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  t= scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int arr[] = new int[2];
            arr[0] = scn.nextInt();
            arr[1] = scn.nextInt();
            Arrays.sort(arr);

            
                System.out.println((int)Math.pow(Math.max(arr[0]*2,arr[1]),2));
                     
        }
    }
}