import java.util.Scanner;

public class A_Palindromic_Twist {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t--!=0) {
            boolean ans = true;
            int n = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();
            for(int i =0;i<=n/2;i++){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(n-i-1);
                int k = Math.max(ch1, ch2)-Math.min(ch1,ch2);
                if(!(k==0||k==2)){
                    ans = false;
                }
            }
            if(ans)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}