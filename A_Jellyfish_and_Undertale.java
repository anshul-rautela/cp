import java.util.*;

public class A_Jellyfish_and_Undertale {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Long t = scn.nextLong();
        
        while (t--!=0) {
            scn.nextLine();
            Long a = scn.nextLong();
            Long b = scn.nextLong();
            Long n = scn.nextLong();
            
            scn.nextLine();
            Long sum=b-1;
            Long c =1L;
            
            for(Long i =0L;i<n;i++){
                Long arr = scn.nextLong();
                sum+=Math.min(a, c+arr)-1;
            }    
                System.out.println(sum+1);           
        }
    }
}
