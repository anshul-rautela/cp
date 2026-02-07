import java.util.Scanner;

public class B_Balanced_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n  = scn.nextInt();
            if(n/2%2!=0) System.out.println("NO");
            else{
                System.out.println("YES");
                int k=0;
                for(int i =0;i<n/2;i++){
                    System.out.print((1+i)*2+" ");
                    k = (1+i)*2;
                }
                int midsum =(k+2)/2;
                k = midsum;
                for(int i = n/4;i<n/2;i++){
                    System.out.print(midsum+" ");
                    midsum+=2;
                    System.out.print(k+" ");
                    k-=2;
                }

                
                System.out.println();

            }


        }
    }
}