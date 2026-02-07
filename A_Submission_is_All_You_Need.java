import java.util.Scanner;

public class A_Submission_is_All_You_Need {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int sum =0;
            for(int i =0;i<n;i++){
                int k = scn.nextInt();
                if(k==0)sum++;
                else sum+=k;
            }
            System.out.println(sum);
        }
    }
}