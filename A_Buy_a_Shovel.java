import java.util.Scanner;

public class A_Buy_a_Shovel {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int r = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            int no = (k * i)%10;
            if (no == r || no == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}