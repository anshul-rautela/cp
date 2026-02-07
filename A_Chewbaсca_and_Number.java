import java.util.*;

class A_Chewbaсca_and_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
    
        for(int i =0;i<n.length();i++){

            if(i==0&&(n.charAt(i)=='0'||n.charAt(i)=='9')){
                System.out.print(9);
            }
            else if(n.charAt(i)<='4')
                System.out.print(n.charAt(i));
            else
                System.out.print('9'-n.charAt(i));
        }
    }
}