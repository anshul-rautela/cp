import java.util.Scanner;

public class A_Goals_of_Victory {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int sum=0;
            for(int i =0;i<n-1;i++){
                sum+=scn.nextInt();
            }
            System.out.println(-sum);
        }
    }
}