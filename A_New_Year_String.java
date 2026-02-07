import java.util.Scanner;

public class A_New_Year_String {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            int n = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();
            if(s.contains("2025")){
                if(s.contains("2026")){
                        System.out.println(0);
                }else System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}