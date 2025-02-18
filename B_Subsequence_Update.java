import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Subsequence_Update {

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt();
            int l = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0;i<n;i++){
                arr.add(scn.nextInt());
            }
            scn.nextLine();
            int k = m-l+1;
            int sum =0;
            Collections.sort(arr);
            for(int i =0;i<k;i++){
                sum+=arr.get(i);
            }
            System.out.println(sum);
        }
    }

}