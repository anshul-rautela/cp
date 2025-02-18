import java.util.Scanner;

public class A_Chewba{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
     //   int t = sc.nextInt();
    //    while (t-- > 0) 
            solve();
        
    }

    static void solve() {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long m = n,sum=0;
        StringBuilder s= new StringBuilder();
        StringBuilder s1=new StringBuilder();
        while (m!=0) {
            long rem = m%10;
            m/=10;
            if(m==0&&rem==9){
                s.append("9");
            }
            else if(rem>4){ rem=9-rem;
                s1=new StringBuilder(String.valueOf(rem));
                s.append(s1);
            }
            else{
                s.append(String.valueOf(rem));
            }
        //int reversed = Integer.parseInt(new StringBuilder(String.valueOf(sum)).reverse().toString());
    } System.out.println(s);
}
}