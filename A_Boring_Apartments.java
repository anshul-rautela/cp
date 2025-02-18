import java.util.Scanner;

public class A_Boring_Apartments {

    static int f(int n,int k){
        if(n==0) return 0;
        return k+f(n/10,k+1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt();
            scn.nextLine();

            int sol = 10*((n-1)%10);
            sol+=f(n,1);
            System.out.println(sol);
        }
    }
}