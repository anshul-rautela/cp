import java.util.Scanner;

public class A_Diverse_Substring {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
    
        boolean diverse = false;

        char ch = s.charAt(0);
        int j = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=ch){
                j = i;
                diverse = true;
                break;
            }
        }
        
        if(diverse)
        {
            System.out.println("YES");
            System.out.print(ch);
            System.out.print(s.charAt(j));
        }
        else System.out.println("NO");

    }
}