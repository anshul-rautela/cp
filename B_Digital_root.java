import java.util.Scanner;
public class B_Digital_root {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            Long k = scn.nextLong();
            int n = scn.nextInt();
            System.out.println(n+(k-1)*9);
        }
    }
}