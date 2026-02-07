import java.util.HashMap;
import java.util.*;

public class B_Chemistry {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();

            Map<Character,Integer>map = new HashMap<>();
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.getOrDefault(ch, 0)+1);
                }else map.put(ch,1);
            }
            int cnt =0;
            for(char x:map.keySet()){
                if(map.get(x)%2!=0){
                    cnt++;
                }
            }
            if(cnt>k+1) System.out.println("NO");
            else System.out.println("YES");

        }

    }
}