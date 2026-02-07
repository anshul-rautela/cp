import java.util.Scanner;

public class B_String_LCM {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        while (t--!=0) {
            StringBuilder s1 = new StringBuilder(scn.nextLine());
            StringBuilder s2 = new StringBuilder(scn.nextLine());            
            StringBuilder s11 = new StringBuilder(s1);
            StringBuilder s22 = new StringBuilder(s2);


            boolean ans = false;
            int n = 5;
            while (n--!=0) {
                
                if(s1.length()==s2.length()&&s1.toString().equals(s2.toString())){
                    ans = true;
                    break;
                }
                else if(s1.length()==s2.length()&& !(s1.equals(s2))){
                    break;
                }

                if(s1.length()<s2.length()) {
                    s1.append(s11);
                }
                
                if (s2.length()<s1.length()) 
                    s2.append(s22);              
            }

            if(ans) System.out.println(s1);
            else System.out.println(-1);
        }
    }
}