//odd-> 1
//even-> 

import java.util.Scanner;

public class B_Longest_Divisors_Interval {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while (t--!=0) {
            scn.nextLine();
            long n = scn.nextLong();
            long maxi =1;
            if(n%2!=0) System.out.println(1);
            else{
                long m = n; 
                int div = 2;
                while (m!=1) {
                    if(m%div==0){
                        m/=div;
                        long temp = m;
                        while (n%temp==0) {
                            temp++;
                        }
                        long temp2 = m;
                        while (temp2>0&&n%temp2==0) {
                            temp2--;
                        }
                        maxi = Math.max(maxi, temp-temp2-1);
                    }else div++;
                }
                System.out.println(maxi);
            }

        }
    }
}