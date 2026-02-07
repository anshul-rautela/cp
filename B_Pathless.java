import java.util.Arrays;
import java.util.Scanner;

public class B_Pathless {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t   = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int s = scn.nextInt();
            int arr[] = new int[n];
            int sum =0;
            int num0=0;
            int num1=0;
            int num2=0;
            for(int i =0;i<n;i++){
                int k =scn.nextInt();
                sum+=k;
                arr[i]=k;
                if(k==0)num0++;
                if(k==1)num1++;
                if(k==2)num2++;
            }
            if(sum>s){
                for(int i =0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(sum==s){
                System.out.print(-1);
            }

            else if((sum+1==s)){
                for(int i =0;i<num0;i++){
                    System.out.print(0+" ");
                }
                for(int i =0;i<num2;i++){
                    System.out.print(2+" ");
                }
                for(int i =0;i<num1;i++){
                    System.out.print(1+" ");
                }
            }
            else System.out.print(-1);
            System.out.println();
        }
    }
}