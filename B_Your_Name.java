import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class B_Your_Name {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        while (t--!=0) {
            int n = scn.nextInt();
            scn.nextLine();
            String s1 = scn.nextLine();

            StringBuilder s = new StringBuilder("");
            StringBuilder t1 = new StringBuilder("");
            int i =0;
            for( i =0;i<s1.length();i++){
                if(s1.charAt(i)==' ') break;
                s.append(s1.charAt(i));
            }
            for(i= i+1;i<s1.length();i++){
                if(s1.charAt(i)==' ') break;
                t1.append(s1.charAt(i));
            }
            Map<Character,Integer> map = new HashMap<>();

            for(int j =0;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                }
                else map.put(s.charAt(j), 1);
            }
            boolean sol = true;
            for(int j =0;j<s.length();j++){
                if(map.containsKey(t1.charAt(j))){
                    map.put(t1.charAt(j), map.get(t1.charAt(j))-1);
                    if(map.get(t1.charAt(j))<0){ sol = false; break;}
                }
                else {
                    sol = false;
                    break;
                }
            }

            for(Character x:map.keySet()){
                if(map.get(x)!=0){
                    sol = false; break;
                }
            }

            if(sol) System.out.println("YES");
            else System.out.println("NO");
        }


    }
}