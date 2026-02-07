import java.util.Arrays;
import java.util.Scanner;

public class A_United_We_Stand {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t-- != 0) {
            scn.nextLine();
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            Arrays.sort(arr);
            int lb = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[0]) {
                    lb++;
                }
            }
            if (lb == n)
                System.out.println(-1);
            else {
                System.out.println(lb+" "+(n-lb));
                for (int i = 0; i < lb; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                for (int i = lb; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }
}