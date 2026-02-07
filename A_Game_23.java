import java.util.Scanner;

public class A_Game_23 {
    public static  int f(int n, int m,int cnt){
        if(n==m)
            return cnt;
        else if(n>m) return -1;
        else{
            int k1 = f(n*2,m,cnt+1);
            int k2 =f(n*3,m,cnt+1);
        
            if(k1!=-1) return k1;
            return k2;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();
        int m  = scn.nextInt();
        

        System.out.println(f(n,m,0));

    }
}