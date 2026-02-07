import java.util.Scanner;

public class A_LCM_Problem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int  n = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();

            if(n*2<=m)
                System.out.println(n+" "+2*n);
            else System.out.println(-1+" "+-1);    
         }
    }
}