import java.util.*;
public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int t = scn.nextInt();
           scn.nextLine();
        while (t--!=0) {
            int n =scn.nextInt();scn.nextLine();
            String s = scn.nextLine();

        int cnt =0;
        int cntdot =0;
        boolean two = false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                cntdot++;
                if(cntdot>2){
                    two =true;break;
                }
            }
            else{ cnt+=cntdot;
                    cntdot=0;}
        }
        cnt+=cntdot;
        if(two) System.out.println("2");
        else System.out.println(cnt);
    }

    }
}