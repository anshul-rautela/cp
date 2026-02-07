import java.util.Scanner;

public class B_Lovely_Palindromes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder s = new StringBuilder(scn.nextLine());
        StringBuilder sb = new StringBuilder(s);
        s.reverse();
        sb.append(s);
        System.out.print(sb);
    
    }
}