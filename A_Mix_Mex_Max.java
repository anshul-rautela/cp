import java.util.Scanner;
import java.util.*;

public class A_Mix_Mex_Max {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();scn.nextLine();
            int arr[] = new int[n];

            for(int i =0;i<n;i++){
                arr[i]= scn.nextInt();
            }
            boolean ans = true;
            for(int i =0;i+3<n;i++){
                int j =i;
                int a1  = arr[j];
                int a2  = arr[j+1];
                int a3  = arr[j+2];
                int maxi = Math.max(a2, Math.max(a1, a3))-Math.min(a2, Math.min(a1, a3));
                Set<Integer>s = new HashSet<>();
                s.add(a1);
                s.add(a3);
                s.add(a2);
                int last = 3;
                for(int k =0;k<3;k++){
                    if(!s.contains(k)){
                        last= k;
                        break;
                    }
                }
                if(maxi!=last){
                    ans = false;
                    break;
                }

            }
            if(ans) System.out.println("YES");
            else System.out.println("NO");

        }


    }
}