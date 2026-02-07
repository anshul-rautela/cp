import java.util.Scanner;

public class A_Ambitious_Kid {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        int mini = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            int k = scn.nextInt();
            mini = Math.min(mini, Math.abs(k));
        }
        System.out.println(mini);
    }
}   