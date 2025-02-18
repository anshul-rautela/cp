import java.util.Scanner;

public class A_Repeating_Cipher {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
        int k =0;
        for(int i =0;i<n;i+=k){
            System.out.print(s.charAt(i));
            k++;
        }
    }
}