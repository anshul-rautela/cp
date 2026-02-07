import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class D_Sum_of_LDS {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int arr[]= new int[n];
            Deque<Integer>dq = new ArrayDeque<>();
            for(int i =0;i<n;i++){
                dq.addLast(scn.nextInt());
            }
            int i =0;
            while (n--!=0) {
                int f = dq.getFirst();
                int l = dq.getLast();
                int mini = Math.min(f, l);
                int maxi = Math.min(f, l);
                if(i%2==0){
                    if(dq.getFirst()==mini){
                        dq.removeFirst();
                        System.out.println("");
                    }
                    else{
                        dq.removeLast();
                    }
                    
                }
            }


        }
    }
}