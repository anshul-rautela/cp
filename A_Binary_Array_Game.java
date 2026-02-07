import java.util.Scanner;

public class A_Binary_Array_Game {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int sol = -1;
            if(arr[0]==1&& arr[n-1]==1){
                // System.out.println("Alice");
                sol = 0;//a
            }
            else if(arr[0]==0&& arr[n-1]==0){
                // System.out.println("Alice");
                sol = 1;
            }
            else if(arr[0]==0||arr[n-1]==0){
                // System.out.println("Alice");
                sol = 0;
            }
            if(sol==0) System.out.println("Alice");
            else System.out.println("Bob");


            // logic here
        }
        scn.close();
    }
}