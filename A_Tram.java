import java.util.Scanner;

public class A_Tram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ith =0;
        scn.nextLine();
        int maxi =0;
        for(int i =0;i<n;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            scn.nextLine();
            maxi = Math.max(maxi, ith+b-a);
            ith = b-a+ith;
        }
        System.out.println(maxi);
    }
}