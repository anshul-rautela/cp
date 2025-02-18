import java.util.*;
public class A_Sum_of_Round_Numbers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // Number of test cases
        while (t-- > 0) {
            solve(scn); // Pass the Scanner to the solve method
        }
        scn.close();
    }

    static void solve(Scanner scn) {
          //  Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();//scn.nextLine();
            int m=n;
            int sol=0;
            StringBuilder s = new StringBuilder();
            int x=0;
            while(m!=0){
                int rem = m%10;
                if(rem!=0){
                    sol++;
                    s.append(String.valueOf((int)Math.pow(10, x)*rem));
                    s.append(" ");
                }
                x++;
                m/=10;
            }          
            System.out.println(sol);
            System.out.println(s); 
        }
}