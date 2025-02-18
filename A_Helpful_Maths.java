import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Character ch[]= new Character[s.length()];
        for(int i =0;i<s.length();i++){
            ch[i]=s.charAt(i);   //1=2=3
        }
        Arrays.sort(ch);           //==123

        Character ch2[]= new Character[s.length()];
        int j =0;
        for(int i =0;i<s.length();i++){
            if(ch[i]=='1'){
                ch2[j]='1';
                if(i!=s.length()-1&&ch[i+1]!='+'){
                    ch2[j+1]='+';
                }
                j+=2;
            }
            
        }
        for(int i =0;i<s.length();i++){
            if(ch[i]=='2'){
                ch2[j]='2';
                if(i!=s.length()-1&&ch[i+1]!='+'){
                    ch2[j+1]='+';
                }
                j+=2;
            }
            
        }
        for(int i =0;i<s.length();i++){
            if(ch[i]=='3'){
                ch2[j]='3';
                if(i!=s.length()-1&&ch[i+1]!='+'){
                    ch2[j+1]='+';
                }
                j+=2;
            }
            
        }
        for(int i =0;i<s.length();i++){
            System.out.print(ch2[i]);
        }
    }
}