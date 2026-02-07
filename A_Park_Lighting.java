import java.util.Scanner;

public class A_Park_Lighting {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int f = scn.nextInt();
            int s = scn.nextInt();
            int m = f*s;

            int sol = m/2+m%2;
            System.out.println(sol);
        }
    }
}