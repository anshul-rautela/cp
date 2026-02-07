import java.util.Scanner;

public class A_cAPS_lOCK {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        boolean change = true;

        for(int i = 1;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='a'&&ch<='z'){
                change = false;
                break;
            }
        }

        if(change||s.length()==1){
        
            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch>='a'&&ch<='z'){
                    ch = Character.toUpperCase(ch);
                }
                else     ch= Character.toLowerCase(ch);
                System.out.print(ch);
            }
    }
    else{
        System.out.println(s);
    }


    }
}