import java.util.HashMap;
import java.util.*;

public class A_Shuffle_Hashing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t--!=0) {
            String p = scn.nextLine();
            String h = scn.nextLine();        
            Map<Character,Integer>map = new HashMap<>();
            int np =p.length();
            int nh =h.length();
            
            if(nh<np) System.out.println("NO");
            else{
            for(int i =0;i<np;i++){
                char ch = p.charAt(i);
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else map.put(ch, 1);
            }  
            map.put('*',0);
            int cnt =1;

            for(int i =0;i<np;i++){
                char ch = h.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0)cnt++;
                    else if(map.get(ch)==-1) cnt--;
                }
                else map.put('*', map.get('*')+1);
            }
            boolean found = false;
            if(map.get('*')>0) cnt--;
            int l = 0;
            int r;
            if(cnt ==map.size()) System.out.println("YES");
            else{

            for(int i =np;i<nh;i++){
                r = i;
                char chr = h.charAt(r);
                char chl = h.charAt(l);
                l++;
                if(map.containsKey(chl)){
                    map.put(chl, map.get(chl)+1);
                    if(map.get(chl)==0) cnt++;
                    else if(map.get(chl)==1) cnt--;
                }
                else{
                    map.put('*', map.get('*')-1);
                    if(map.get('*')==0){
                        cnt++;
                    }
                    else if(map.get('*')==-1) cnt--;
                }
                if(map.containsKey(chr)){
                    map.put(chr, map.get(chr)-1);
                    if(map.get(chr)==0) cnt++;
                    else if(map.get(chr)==-1)cnt--;
                }
                else{
                    map.put('*', map.get('*')+1);
                    if(map.get('*')==0){
                        cnt++;
                    }
                    else if(map.get('*')==1) cnt--;
                }

                if(cnt==map.size()){
                    found = true;
                    break;
                }
            }
            if(found) System.out.println("YES");
            else System.out.println("NO");  
            }
        }
        }
    }
}
