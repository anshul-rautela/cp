import java.util.Scanner;

public class B_New_Year_Cake {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t-- > 0) {
            long a = scn.nextLong(); 
            long b = scn.nextLong(); 

            long whiteA = 0, darkA = 0;
            long whiteB = 0, darkB = 0;

            long size = 1;
            int ans = 0;

            for (int i = 0; i < 60; i++) {
                if (i % 2 == 0) {
                    whiteA += size;
                    darkB += size;
                } else {
                    darkA += size;
                    whiteB += size;
                }

                if ((whiteA <= a && darkA <= b) ||
                    (whiteB <= a && darkB <= b)) {
                    ans = i + 1;
                } else {
                    break;
                }

                size <<= 1; // size *= 2
            }

            System.out.println(ans);
        }
    }
}
