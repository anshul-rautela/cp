import java.util.Scanner;

public class B_Dice_Tower {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t--!=0) {
            Long n = scn.nextLong();
            if(n%14==0||n%14>6){
                System.out.println("NO");
            }
            else if(n<15) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}