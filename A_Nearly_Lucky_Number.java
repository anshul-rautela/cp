import java.util.Scanner;

public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long m = n;
        int sum =0;
        while (m!=0) {
            long rem = m%10;
            if(rem!=7&&rem!=4){
                
            }
            else sum++;
            m/=10;
        }
        if(sum==4||sum==7)
        System.out.println("YES");
        else
            System.out.println("NO");
    }
}