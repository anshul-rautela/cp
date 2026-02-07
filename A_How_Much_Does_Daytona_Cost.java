import java.util.Scanner;

public class A_How_Much_Does_Daytona_Cost {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int  n = scn.nextInt();
            int k = scn.nextInt();
            String ans = "NO";
            boolean found = false;
            for(int i =0;i<n;i++){
                int m = scn.nextInt();
                if(m==k) found = true;
            }
            if(found) System.out.println("YES");
            else System.out.println(ans);

        }
    }
}