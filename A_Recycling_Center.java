import java.util.Arrays;
import java.util.Scanner;

public class A_Recycling_Center {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();

            int n = scn.nextInt();
            int c = scn.nextInt();


            int arr[]= new int[n];
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            Arrays.sort(arr);

            int cnt=0;
            for(int i =n-1;i>=0;i--){
                if(arr[i]<=c){
                    cnt++;
                    c/=2;
                }
            }
            
            System.out.println(n-cnt);
        }
    }
}