import java.util.Scanner;

public class B_Lasers {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt(); //y cord of horizontal B_Lasers;
            int m = scn.nextInt(); //x cord of ver B_Lasers;
            int x = scn.nextInt();
            int y = scn.nextInt();
            
            scn.nextLine();
            int arrn[] = new int[n];
            int arrm[] = new int[m];
            
            int sol =0;
            for(int i =0;i<n;i++){
                arrn[i] = scn.nextInt();
                if(arrn[i]<=y) sol++;
                // else if(arrn[i]==y)
            }
            scn.nextLine();
            for(int i =0;i<m;i++){
                arrm[i] = scn.nextInt();
                if(arrm[i]<=x) sol++;
                // else if(arrm[i]==x) 
            }
            // if(arrn[0]==0 && arrm[0]==0){
            //     sol+=2;
            // }
            // if(arrn[n-1]==0 && arrm[m-1]==0){
            //     sol+=2;
            // }
            
            System.out.println(sol);



        }
    }
}