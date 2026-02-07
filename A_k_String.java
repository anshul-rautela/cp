import java.util.*;
public class A_k_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();


        Map<Character,Integer>map = new HashMap<>();


        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        boolean ans = true;
        
        for(Character x:map.keySet()){
            if(map.get(x)%n!=0){
                ans = false;
                break;
            }
        }
        if(!ans){
            System.out.println(-1);
        }
        else{         
            int n1=n;   
            while (n1--!=0){
                for(Character x:map.keySet()){
                    int k = map.get(x)/n;
                    for(int i =0;i<k;i++)
                        System.out.print(x);                                               
                }
            }
        }
    }
}