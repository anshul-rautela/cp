import java.util.Scanner;

public class A_Filling_Shapes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1]=0;
        for(int i =2;i<=n;i++){
            arr[i]= arr[i-2]*2;
        }
        System.out.println(arr[n]);

    }
}