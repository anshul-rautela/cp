import java.util.Arrays;
import java.util.Scanner;

public class A_Collecting_Coins {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int arr[] = new int[3];
            for(int i =0;i<3;i++){
                arr[i]=scn.nextInt();
            }
            int m = scn.nextInt();
            Arrays.sort(arr);
            int k = arr[2]-arr[1];
            k+=(arr[2]-arr[0]);

            int sol = m-k;
            if(sol>=0&&sol%3==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}