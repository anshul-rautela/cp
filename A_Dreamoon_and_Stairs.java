import java.util.Scanner;

public class A_Dreamoon_and_Stairs {


    static int f(int n,int m,int cnt){
        if(n==0){
            if(cnt%m!=0) return -1;
            else return cnt;
        }
        if(n<0)  return -1;

        int k1 = f(n-2,m,cnt+1);
        if(k1!=-1) return k1 ;
        int k2 = f(n-1,m,cnt+1);
        if(k1!=-1&&k2!=-1) return Math.min(k1, k2);
        else if(k1==-1&&k2==-1) return -1;
        else if(k1==-1) return k2;
        else return k1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(f(n,m,0));

    }
}