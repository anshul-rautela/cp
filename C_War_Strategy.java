import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Scanner;
public class C_War_Strategy {

    public static void main(String[] args) {



// public class Main {
    // public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();

            long left = Math.min(k - 1, m);
            long right = Math.min(n - k, m);

            long answer = Math.min(n, Math.min(m + 1, 1 + left + right));

            System.out.println(answer);
        }

        sc.close();
    }
}
