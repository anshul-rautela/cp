import java.util.Scanner;

public class A_New_Year_Transportation {

    public static void main(String[] args) {
            Scanner scn  = new Scanner(System.in);
            int n = scn.nextInt()-1;
            int k = scn.nextInt();
            scn.nextLine();
            int arr[]= new int[n];
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            int i =0;
            while (i<k-1) {
                i+=arr[i];
            }
            if(i==k-1) System.out.println("YES");
            else System.out.println("NO");
    }
}