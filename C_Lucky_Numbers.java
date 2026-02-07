import java.util.Scanner;

public class C_Lucky_Numbers {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        Long n = scn.nextLong();

        Long p = (long)Math.pow(2, n+1) - 2;
        System.out.println(p);
    }
}