import java.util.Scanner;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int cnt =0;
        while (a<=b) {
            a*=3;
            b*=2;
            cnt++;
        }System.out.println(cnt);
    }
}