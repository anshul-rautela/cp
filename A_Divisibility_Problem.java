import java.util.Scanner;

public class A_Divisibility_Problem {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            if(a%b==0)
            System.out.println(0);
            else  
            System.out.println(b-a%b);
        }
    }
}