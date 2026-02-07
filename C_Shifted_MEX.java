import java.util.*;

public class C_Shifted_MEX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            Arrays.sort(arr);
            int maxi =1;            
            for(int i =0;i<n;i++){
                int cnt =1;
                for(int j = i+1;j<n;j++){
                    // System.out.println(arr[j-1]+" "+arr[j]+" "+cnt);
                    if(arr[j-1]+1==arr[j]){
                        cnt++;
                        maxi = Math.max(maxi, cnt);
                    }
                    else if(arr[j-1]==arr[j]){
                        
                    }
                    else{
                        i = j-1; 
                        cnt =1;
                        break;
                    }
                }
            }

            System.out.println(maxi);
        }
    }
}