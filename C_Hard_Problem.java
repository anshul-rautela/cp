import java.util.Scanner;

public class C_Hard_Problem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T--!=0) {
            scn.nextLine();
            int m = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int n = m;
            int s=0;
            s+=m-a;
            if(s<=0)s=0;
            int sol=Math.min(m,a);
            int s2=0;
            s2+=(n-b); if(s2<0)s2=0;
            sol+=Math.min(n,b);
            sol+=Math.min(s+s2,c);
            System.out.println(sol);
        }
    }
}