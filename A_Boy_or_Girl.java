import java.util.HashSet;
import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        HashSet<Character>set= new HashSet<>();
        for(int i =0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}