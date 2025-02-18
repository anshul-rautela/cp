import java.util.Scanner;

public class C_Penchick_and_BBQ_Buns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T--!=0){
            int n = scn.nextInt();
            if((n&1)==1){
                System.out.print(-1);
            }
            else{
                int k =1;
                for(int i =0;i<n;i++){
                    System.out.print(k+" ");
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
    
}