import java.util.ArrayList;
import java.util.*;

public class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();

            int arr[] = new int[n];

            int k =0;

            Queue<Integer>q = new LinkedList<>();

            for(int i =0;i<n;i++){
                arr[i] = scn.nextInt();
                if(i!=0&&arr[i-1]>arr[i]){ k++; q.add(1);}
                q.add(arr[i]);
            }
            System.out.println(k+n);
            for(int x:q){
                System.out.print(x+" ");
            }System.out.println();


        }

    }    
}
