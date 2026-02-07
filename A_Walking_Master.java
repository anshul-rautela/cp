import java.util.Scanner;

public class A_Walking_Master {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();

            int sol = -1;
            sol = d-b;
            if(sol<0){
                System.out.println(-1);
            }
            else{
                a+=sol;
                b+=sol;
                sol+=(a-c);
                if(c>a) System.out.println(-1);
                else System.out.println(sol);
            }


        }

    }
}