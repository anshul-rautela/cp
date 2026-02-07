import java.util.Scanner;

public class C_Vasilije_in_Cacak {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- != 0) {
            scn.nextLine();

            long n = scn.nextLong();
            long k = scn.nextLong();
            long x = scn.nextLong();

            long sumMin = ((2 + (k - 1)) * k) / 2;// System.out.println(sumMin);

            long sumMax = ((2 * (n - k + 1) + (k - 1)) * k) / 2; // System.out.println(sumMax);

            if (x >= sumMin && sumMax >= x)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}