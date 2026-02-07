import java.util.Scanner;

public class D_1_Magic_Powder_1 {

    static boolean check(int mid,int has[],int need[],int k){
        
        int n = has.length;
        int tomid = 0;

        for(int i =0;i<n;i++){
            if((mid*need[i] - has[i])>0)
                tomid+= mid*need[i] - has[i];
        }

        if(tomid<=k) return true;        
        return false;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int need[]= new int[n];
        int has[]= new int[n];

        scn.nextLine();

        for(int i =0;i<n;i++){
            need[i]=scn.nextInt();
        }
        scn.nextLine();

        int start =Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            has[i]=scn.nextInt();
            start=Math.min(start, has[i]/need[i]);
        }

        int end = start+k;
        int sol = 0;
        

        while (start<=end) {
            int mid= (start+end)/2;
            if(check(mid,has,need,k)){
                sol = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        System.out.println(sol);
    }
}