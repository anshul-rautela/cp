import java.util.Scanner;

public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t--!=0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();
            StringBuilder sn = new StringBuilder(scn.nextLine());
            String sm = scn.nextLine();
            boolean found = false;
            int cnt =0;
            while (true) {
                if(sn.indexOf(sm)!=-1){
                    found = true;
                    break;
                }
                cnt++;
                sn.append(sn);
                if(sn.length()>=25*sm.length()) break;
            }
            if(found)System.out.println(cnt);
            else System.out.println(-1);
        }
    }
}