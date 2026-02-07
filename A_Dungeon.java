import java.util.Scanner;

public class A_Dungeon {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
        
            
            int sum = a+b+c;
            int k = sum/9-1;
            if(sum%9==0&&a>k&&b>k&&c>k){
                System.out.println("YES");
            }
            else System.out.println("NO");
        
        }
    }
}