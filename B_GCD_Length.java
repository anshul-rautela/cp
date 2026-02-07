import java.util.Scanner;

public class B_GCD_Length {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
        
            String s = "9";
            StringBuilder k = new StringBuilder("9");
            while (s.length()!=c) {
                s+=k;
            }
            Long cl = Long.parseLong(s);
            Long al = (long)cl;
            Long bl = (long)cl;
            
            while (true) {
                String als = al.toString();
                if(als.length()==a) break;
                al*=2;
            }
            while (true) {
                String bls = bl.toString();
                if(bls.length()==b) break;
                bl*=3;
            }
            System.out.println(al+" "+bl);      
        
        }
    }
}