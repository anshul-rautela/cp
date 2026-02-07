import java.util.Scanner;

public class A_Magical_Sticks {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            System.out.println(n/2+n%2);

        }
    }
}