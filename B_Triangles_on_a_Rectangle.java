import java.util.Scanner;

public class B_Triangles_on_a_Rectangle {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while (t--!=0) {
            
            
            long f = scn.nextLong();
           long s = scn.nextLong();
            scn.nextLine();

            long n1 = scn.nextLong();
            long k1 = scn.nextLong();
            long k2=0;
            for(long i =1;i<n1;i++){
                k2=scn.nextLong();
            }
            scn.nextLine();
            long n2 = scn.nextLong();
            long k3= scn.nextLong();
            long k4=0;
            for(long i =1;i<n2;i++){
                k4=scn.nextLong();
            }
            scn.nextLine();
            
            long sol1 = Math.max(k2-k1, k4-k3)*s;

            
            long n11 = scn.nextLong();
            long k11 = scn.nextLong();
            long k21=0;
            for(long i =1;i<n11;i++){
                k21=scn.nextLong();
            }
            scn.nextLine();
            long n21= scn.nextLong();
            long k31= scn.nextLong();
            long k41=0;
            for(long i =1;i<n21;i++){
                k41=scn.nextLong();
            }
            scn.nextLine();
            
            long sol11 = Math.max(k21-k11, k41-k31)*f;
            
            System.out.println((long)Math.max(sol11, sol1));
        }
    }
}