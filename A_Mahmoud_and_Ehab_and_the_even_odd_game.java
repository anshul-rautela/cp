import java.util.Scanner;

public class A_Mahmoud_and_Ehab_and_the_even_odd_game {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2!=0) System.out.println("Ehab");
        else System.out.println("Mahmoud");
    }
}