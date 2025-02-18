import java.util.Scanner;

public class A_Maximum_Increase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]= new int[n];
        scn.nextLine();
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int maxi =1;
        int sum = 1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sum++;
                if(maxi<sum) maxi =sum;
            }
            else {sum=1;}
        }
        System.out.println(maxi);
    }
}