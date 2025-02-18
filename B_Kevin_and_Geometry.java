import java.util.Arrays;
import java.util.Scanner;

public class B_Kevin_and_Geometry {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {

            
            int n = scn.nextInt();
            int arr[]= new int[n];
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            scn.nextLine();
            Arrays.sort(arr);

            //int sim[]= new int[n];
         
            int maxi =0;
            for(int i =0;i<n;i++){
                if(i!=0){
                       if(arr[i]-arr[i-1]==0)
                            maxi = Math.max(maxi, arr[i]);                
                }
            }
            int sum = maxi*2;
            int mini =Integer.MAX_VALUE;
            int minInd=-1;
            int minInd2=-1;
            for(int i =0;i<n;i++){
                if(i!=0){
                    int k = arr[i]-arr[i-1];
                    if(mini>k){
                     mini =k ;
                     minInd2=arr[i];
                    minInd=arr[i-1];
                    }   
                }}
                    if(maxi-mini>=0) System.out.println(maxi +" "+ maxi +" "+ minInd +" "+ minInd2);
               
            else{
                    System.out.println(-1);
                }
        }
    }
}