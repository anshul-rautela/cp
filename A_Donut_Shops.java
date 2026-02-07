import java.util.Scanner;

public class A_Donut_Shops {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            Long a = scn.nextLong();
            Long b = scn.nextLong();
            Long c = scn.nextLong();
            
            if(b*a<=c)
                System.out.println(1+" "+-1);
            else if(a<c)
                System.out.println(1+" "+b);
            else
                System.out.println(-1+" "+b);

            
        }

    }
}