import java.util.Scanner;

public class A_Everybody_Likes_Good_Arrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int arr[]= new int[n];
            scn.nextLine();
            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
            }
            int sol =0;
            for(int i =0;i<n;i++){
                int k = arr[i]%2;
                for(int j =i+1;j<n;j++){
                    if(j==i+1&&k!=arr[j]%2){
                        break;
                    }
                    if(k!=arr[j]%2){
                        sol+=j-i-1;
                        i = j-1;
                        break;
                    }
                    if(j==n-1){
                        sol+=j-i;
                        i = n;
                        break;
                    }
                }
            }
            System.out.println(sol);


        }


    }
}