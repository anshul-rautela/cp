    import java.util.Scanner;
     
    public class B_Left_and_Down {
     public static long findHCF(long a, long b) {
            // Ensure a and b are non-negative
            a = Math.abs(a);
            b = Math.abs(b);
     
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
     
            return a; // HCF
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            long t = scn.nextInt();
            while (t--!=0) {
                scn.nextLine();
                long a = scn.nextLong();
                long b= scn.nextLong();
                long k = scn.nextLong();              
                
                if(k>=a && k>=b) System.out.println(1);
                else{
                long hcf = findHCF(a, b);
                if(hcf!=1 && a/hcf<=k&&b/hcf<=k) System.out.println(1);
                else System.out.println(2);        
                }
            }
        }
    }