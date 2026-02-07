import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        System.out.println(n/5+(n%5>0?1:0));
    }
}