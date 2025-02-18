
// deletes all the vowels,
// inserts a character "." before each consonant,
// replaces all uppercase consonants with corresponding lowercase ones. 

import java.util.Scanner;

public class A_String_Task {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();


        StringBuilder sb = new StringBuilder("");
        int i =0;
        while (i<s.length()) {
            Character ch = s.charAt(i);
            ch=Character.toLowerCase(ch);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='y'){
                sb.append('.');
                sb.append(ch);
            }
            i++;
        
        }
        System.out.println(sb);
    }
}