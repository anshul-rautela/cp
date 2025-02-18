import java.util.Scanner;

public class A_Kevin_and_Combination_Lock 

{


    public static boolean f(int n){
        if(n%33==0)return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T =scn.nextInt();
        
        while (T--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            if(f(n)){
                System.out.println("yes");
            }
            else System.out.println("no");
        }
    }
}