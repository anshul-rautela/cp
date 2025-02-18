import java.util.*;
public class A_C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t--!=0){
            int n = scn.nextInt();
            int m = scn.nextInt();
            int max = scn.nextInt();
            scn.nextLine();

            int mini =0,maxi =0;
            int sum =0;
            while (mini<=max&&maxi<=max) {
                 mini = Math.min(n,m);
                 maxi = Math.max(n,m);
                 mini+=maxi;
                 n = mini;
                 m = maxi;
                sum++;
                }
            System.out.println(sum);
        }
    }
    
}