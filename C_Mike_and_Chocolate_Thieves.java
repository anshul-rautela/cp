import java.util.Scanner;

public class C_Mike_and_Chocolate_Thieves {


    static int checkmid(long mid,long m){
        long cnt =0;
        for(long i =2;Math.pow(i,3)<=mid;i++){
            long end = mid/((long)Math.pow(i, 3));        
                cnt+=end;
                if(cnt>m) return 1;
        }
        if(cnt==m) return 0;
        else if(cnt>m) return 1;
        else  return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long m = scn.nextLong();
        long start = 8;
        long end = 8*m;


        long sol = -1;
        while (start<=end) {
            long mid = start+(end-start)/2;
            int k = checkmid(mid,m);
            if(k==1){
                end = mid-1;
            }   
            else if(k==-1){
                start = mid+1;
            }
            else {
                sol = mid;
                end = mid-1;
            }
        }
        System.out.println(sol);
    }
}