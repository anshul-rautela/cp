import java.util.Scanner;

public class B_Pipeline {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long k = scn.nextLong();
        
        long start = 1;
        long end = k-1;
        long sol = -1;
        if(k>=n){ 
            if(n==1) System.out.println(0);
            else
            System.out.println(1);
        }
            else{
        while (start<=end) {
            long mid  = (start+end)/2;
            long sum =0;
            if(k!=mid+1){
                sum = k*mid-((mid*(mid+1))/2-1);         
            }
                else{
                     sum = k*(mid-1)-((mid*(mid-1))/2-1)+1;        
            
                     //if(n%2==0) sum--;             
            }
            if(sum>=n){
                sol = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        System.out.println(sol);
        }
    }
}