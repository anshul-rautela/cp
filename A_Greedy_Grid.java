import java.util.Scanner;

public class A_Greedy_Grid {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int m1 = scn.nextInt();
            int m2 = scn.nextInt();
            
            if(m1==1||m2==1||(m1<=2&&m2<=2)) System.out.println("NO");
            else System.out.println("YES");


        }
    }
}