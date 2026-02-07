import java.util.Scanner;

public class B_Blank_Space {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();scn.nextLine();
            int maxi = 0;
            int zero =0;
            int prev = -1;
            for(int i =0;i<n;i++){
                int curr = scn.nextInt();
                if(prev==0&&curr==0){
                    zero++;
                    maxi = Math.max(maxi, zero);
                }else if(prev !=0 && curr==0) {zero=1;
                
                
                    maxi = Math.max(maxi, zero);}    prev = curr;
            }
            System.out.println(maxi);
        }
    }
}