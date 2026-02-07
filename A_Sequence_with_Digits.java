import java.util.Scanner;

public class A_Sequence_with_Digits {

    public static int f(long n){
        int max = -1;
        int min = 10;
        while (n!=0) {
            int rem = (int)(n%10);    
            n/=10;
            min = Math.min(min,rem);
            max = Math.max(max,rem);
        }
        return min*max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            Long n = scn.nextLong();
            Long k = scn.nextLong();
            
            Long sol =n;
            Long prev =n;
            for(int i =2;i<=k;i++){
                int sum = f(prev);
                if(sum==0) break;
                sol = prev + sum;
                prev = sol;
            }
            System.out.println(sol);        
        }
    }
}