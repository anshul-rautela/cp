import java.util.Scanner;
import java.util.Stack;

public class C_Longest_Regular_Bracket_Sequence {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int bracketcntL =0;      int bracketcntR =0;
        int n = s.length();
        int cont =0;
        int cnt =0;
        int longest =-1;
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                bracketcntL++;
                cnt++;
            }
            else{
                if(cnt<=0){
                    bracketcntL=0;
                    bracketcntR=0;                    
                    cnt =0;
                }
                else{
                    cnt--;
                    bracketcntR++;
                    if(bracketcntR*2-cnt*2==longest) cont++;
                    else if(bracketcntR*2-cnt*2>longest) cont=1;
                    longest = Math.max(bracketcntR*2-cnt*2,longest);
                }
            }
        }


        if(longest==0)  System.out.println(0+" "+1);
        
        else System.out.println(longest+" "+cont);
    }
}
