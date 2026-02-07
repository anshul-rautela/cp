import java.util.Scanner;

public class B_Caisa_and_Pylons {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        scn.nextLine();
        for(int i =0;i<n;i++){ arr[i]=scn.nextInt();}
        int sol = arr[0];
        
        int sum = 0;
        for(int i =1;i<n;i++){
            sum+=arr[i-1]-arr[i];
            if(sum<0){
                sol+=(-sum);
                sum=0;
            }
        }
        System.out.println(sol);
    }
}