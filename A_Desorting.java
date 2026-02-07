import java.util.Scanner;

public class A_Desorting {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int mini = Integer.MAX_VALUE;
           int prev = scn.nextInt();
            for(int i =1;i<n;i++){
                int curr = scn.nextInt();
                int diff = curr-prev;
                if(diff<0){ mini = -2; break;}
                mini  = Math.min(mini,curr - prev);
                prev = curr;
            }
            System.out.println(mini/2+1);      
        
        }


    }
}