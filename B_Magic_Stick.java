import java.util.Scanner;

public class B_Magic_Stick {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            

            if(a>=b){
                System.out.println("YES");
            }
            else if(a==2&&b==3) System.out.println("YES");
            else if(a<4)    System.out.println("NO");
            else System.out.println("YES");
        }


    }
}