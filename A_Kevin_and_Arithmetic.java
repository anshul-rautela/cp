import java.util.ArrayList;
import java.util.Scanner;

public class A_Kevin_and_Arithmetic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while(T--!=0){
            int n = scn.nextInt();
            int arr[]= new int[n];
            
            int no=0;
            int ne=0;
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
                if(arr[i]%2==0){
                    ne++;
                }else{
                    no++;
                }
            }
            scn.nextLine();
            

            if(no==0){
                System.out.println(1);
            }
            else if(ne==0){
                System.out.println(no-1);
            }
            else {
                System.out.println(no+1);
            }

        }
    }
}