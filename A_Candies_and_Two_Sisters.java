import java.util.Scanner;

public class A_Candies_and_Two_Sisters {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            if(n==1||n==2) System.out.println(0);
            if(n%2==0){
                System.out.println(n/2-1);
            }
            else System.out.println(n/2);
        }
    }
}