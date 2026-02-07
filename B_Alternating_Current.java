import java.util.Scanner;
import java.util.*;

public class B_Alternating_Current {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        Stack<Character>st = new Stack<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(st.empty()||st.peek()!=ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        
        if(st.empty()){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
