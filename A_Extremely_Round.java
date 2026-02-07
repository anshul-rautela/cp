import java.util.Scanner;

public class A_Extremely_Round {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t  = scn.nextInt();


        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int sum = 0;
            int sol =0;
            int m = n;
            while (n!=0) {
                if(n<10) sol +=n;
                int rem = n%10;
                sum++;
                n/=10;
            }

            sol+=((sum-1)*9);
            System.out.println(sol);
        }


    }
}