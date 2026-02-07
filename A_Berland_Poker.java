import java.util.Scanner;

public class A_Berland_Poker {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  t= scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int m = scn.nextInt();
            int k = scn.nextInt();
            int card = n/k;
            int arr[] = new int[k];

            n-=m;
            boolean brk = false;
            while (n!=0) {
                for(int i =1;i<k;i++){
                    if(n!=0 && arr[i]<card){
                        arr[i]++;
                        n--;
                    }
                    else if(arr[i]==card){
                        brk = true;
                        break;
                    }
                }
                if(brk) break;
            }
            int cnt = 0;
            int maxi = 0;
                for(int i =0;i<k;i++){
                    int cur = 0;
                    while(m!=0 && arr[i]<card){
                        arr[i]++;
                        m--;
                        if(i==0) cnt++;
                        else{
                            cur++;
                            maxi = Math.max(maxi, cur);
                        }
                    }
                }
                cnt-=maxi;
            System.out.println(cnt);                 
        }
    }
}