import java.util.Scanner;

public class A_Pasha_and_Stick {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2!=0) System.out.println(0);
        else{
        int sol = n/4;
        if(n%4==0)sol--;
        System.out.println(sol);
        }
    }
}