import java.util.*;
public class B_Tournament {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        
        while (T--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int no = scn.nextInt();
            int k = scn.nextInt();
            
            Set<Integer>set = new HashSet<>();
            int cnt =0;
            
            for(int i = 0;i<n;i++){
                cnt++;
                int num = scn.nextInt();
                
                if(cnt == no){
                    no = num;
                    cnt++;
                }
                set.add(num);
            }

            // System.out.println(no);
            cnt =0;
           // System.out.println(no);
            boolean found = true;
            for(int x: set){
                if(no<x){
                    cnt++;
                }
                if(cnt>=k){
                    found = false;
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
            else System.out.println("YES");

        }
scn.close();

    }
}