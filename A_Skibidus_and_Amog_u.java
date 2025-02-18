import java.util.Scanner;

public class A_Skibidus_and_Amog_u {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();scn.nextLine();
        while (n-->0) {
            String s = scn.nextLine();
            for(int i =0;i<s.length()-2;i++){
                System.out.print(s.charAt(i));
            }
            System.out.println(("i"));
        }
    }
}