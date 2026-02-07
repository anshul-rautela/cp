import java.util.*;

public class B_Erase_First_or_Second_Letter {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        
        while (t--!=0) {
            int n = scn.nextInt();
            scn.nextLine();
            StringBuilder sb = new StringBuilder(scn.nextLine());
            Set<StringBuilder>set = new HashSet<>();
            
            // StringBuilder sb1 =/ new StringBuilder("");
            for(int i =0;i<n;i++){
                    StringBuilder sb1 = new StringBuilder("");
                    for(int j =i;j<n;j++){
                        sb1.append(sb.charAt(j));
                        set.add(sb1);
                    }                
            }
            System.out.println(set.size());


        }
    }
}