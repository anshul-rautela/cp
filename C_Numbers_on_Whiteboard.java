import java.util.*;

public class C_Numbers_on_Whiteboard {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t--!=0) {
            int n = scn.nextInt();scn.nextLine();

            System.out.println(2);
            
            int k1 = n;
            int k2 = n-1;
            System.out.println(k1+" "+k2);
            
            int n1,n2;
            for(int i = n-2;i>=1;i--){
                n2 = i;
                n1 = (k1+k2)/2;
                
                if((k1+k2)%2!=0) n1++;
                
                System.out.println(n1+" "+n2);
                k1 = n1;
                k2 = n2;
            }
        }
    }
}