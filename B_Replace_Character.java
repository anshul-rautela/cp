import java.util.HashMap;
import java.util.Scanner;

public class B_Replace_Character {

    public static void main(String[] args) {
        int T;
        Scanner scn = new Scanner(System.in);
        T = scn.nextInt();
        while (T--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();
            HashMap<Character,Integer>map = new HashMap<>();
            int maxi =-1;
            Character maxChar;
            int mini =Integer.MIN_VALUE;
            Character minChar;
            for(int i =0;i<s.length();i++){
                Character k = s.charAt(i);
                if(map.containsKey(k)){
                    map.put(k, map.get(k)+1);
                    maxi = Math.max(maxi, map.get(k));
                    if(maxi==map.get(k)) maxChar=k;
                }
                else{
                    map.put(k,1);
                }
                mini= Math.min(mini, map.get(i));
                if(mini==map.get(i))minChar=s.charAt(i);
            }

        }
    }
}