import java.util.Scanner;

public class C_Poisoned_Dagger {

    static boolean checkmid(long mid,int arr[],long h){
        long sum =0;
        for(int i =1;i<arr.length;i++){
            sum+=Math.min(arr[i]-arr[i-1], mid);
            if(sum>=h)return true;
        }
        sum+=mid;
        if(sum>=h)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();

            int n = scn.nextInt();
            long h = scn.nextLong();
            int arr[] = new int[n];

            scn.nextLine();

            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
            }
            long start = 1;
            long end = h;

            long sol = 0;
            while (start<=end) {
                long mid = start+(end-start)/2;                
                if(checkmid(mid,arr,h)){
                    sol = mid;
                    end = mid-1;
                }
                else start = mid+1;
            }
            System.out.println(sol);
        }

    }
}