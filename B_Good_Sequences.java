import java.util.Scanner;

public class B_Good_Sequences {
    static int gcd(int a,int b){
        if(b%a==0)
            return a;
        return gcd(b%a, a);
    }

    static int f(int arr[],boolean barr[],int i,int prev){
        if(i>=arr.length) return 0;
        int k = arr[i];
        int pre =0;
        if(prev==-1){
            return 1+f(arr,barr,i+1,i);
        }else{     
            pre =arr[prev];
            int m1=0,m2=0;
        if(gcd(pre, k)>1){
            barr[i]=true;
            m1 = 1+f(arr, barr, i+1, i);
        }
             m2 = f(arr,barr,i+1,prev);
             return Math.max(m1, m2);
    
        }        
    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean barr[]  = new boolean[n];
        int maxi =0;
    
        for(int i =0;i<n-1;i++){
            if(arr[i]==1||barr[i]) continue;
            int k = f(arr,barr,i,-1);
            maxi = Math.max(maxi,k);
        }
        System.out.println(maxi);
    }
}
