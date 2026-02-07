import java.util.Scanner;

public class C_Pacer {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int min = scn.nextInt(); //no of minues
            int pos[] = new int[n];
            int loc[] = new int[n];
            
            int curr =0;
            int sol =0;
            for(int i =0;i<n;i++){
                scn.nextLine();
                loc[i] = scn.nextInt(); //minutes
                pos[i] = scn.nextInt(); //1 snd 0 
                int diff =0;
                if(i==0){
                    diff = loc[i]-curr;
                }
                else{
                    diff = loc[i]-loc[i-1];
                }

                if(curr==pos[i]){
                    if(diff%2==0) sol+=diff;
                    else sol+=diff-1;
                }
                else{
                    curr = pos[i];
                    if(diff%2!=0) sol+=diff;
                    else sol+=diff-1;
                 
                }
            }
            sol+=(min-loc[n-1]);
            System.out.println(sol);
        }
    }
}