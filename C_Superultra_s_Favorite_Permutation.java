import java.util.Scanner;

public class C_Superultra_s_Favorite_Permutation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T=scn.nextInt();

        while (T--!=0) {
            int n=scn.nextInt();
            
            if(n<=4) System.out.print(-1);
            else{
                int arr[]=new int [n];
                for(int i =2;i<=n;i+=2){
                    if(i!=4&&i!=5){
                        System.out.print(i+" ");
                    }
                }
                System.out.print(4+" "+5+" ");
                for(int i =1;i<=n;i+=2){
                    if(i!=4&&i!=5){
                        System.out.print(i+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}