import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class A_Square {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();

            Set<Integer>set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);
            set.add(d);
            if(set.size()==1) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}