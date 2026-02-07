import java.util.Scanner;

public class A_Yet_Another_Two_Integers_Problem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t--!=0) {
            scn.nextLine();
            int x = scn.nextInt();
            int y = scn.nextInt();

            int sol = Math.abs(y/10-x/10);


            if(Math.max(x, y)%10-Math.min(x, y)%10>0)   sol++;
            System.out.println(sol);

        }

    }
}