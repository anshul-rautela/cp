import java.util.Scanner;

public class A_Soft_Drinking {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int p = scn.nextInt();
        int nl = scn.nextInt();
        int np = scn.nextInt();
        
        int drink= k*l;
        int lime=c*d;
        int mindrink = drink/nl;
        int minsalt = p/np;
        int sol = Math.min(lime,Math.min(minsalt,mindrink))/n;

        System.out.println(sol);
    }
}