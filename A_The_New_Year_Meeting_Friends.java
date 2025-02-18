import java.util.Scanner;

public class A_The_New_Year_Meeting_Friends {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n2 = scn.nextInt();
        int n3= scn.nextInt();
        
        System.out.println((Math.max(n2, Math.max(n, n3)))-(Math.min(n2, Math.min(n, n3))));
    }
}