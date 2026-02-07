import java.util.HashMap;
import java.util.*;

public class A_Drinks_Choosing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        Map<Integer,Integer>map = new HashMap<>();

        for(int i =0;i<n;i++){
            scn.nextLine();
            int no = scn.nextInt();
            if(map.containsKey(no)){
                map.put(no,map.get(no)+1);
            }
            else map.put(no,1);
        }
        if(n%2!=0) n++;
        n = n/2;
        
        int oddcnt =0;
        int sol =0;
        int set =0;
        for(int x:map.keySet()){
            x = map.get(x);
            if(x%2==0){
                sol+=(x);
                set+=(x)/2;
            }
            else{
                sol+=(x-1);
                set+=(x-1)/2;
                oddcnt++;
            }        
        }
        if(set<n){
            sol+=n-set;
        }
        System.out.println(sol);



    }
}