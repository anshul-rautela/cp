import java.util.Scanner;

public class B_Fix_You {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt(),m= scn.nextInt();scn.nextLine();
            String s[] = new String[n];
            for(int i =0;i<n;i++) {
                s[i]=scn.nextLine();
            }
            int cnt =0;
            for(int i=0;i<m-1;i++){
                if(s[n-1].charAt(i)=='D') cnt++;
            }
            for(int i=0;i<n-1;i++){
                if(s[i].charAt(m-1)=='R') cnt++;
            }
            System.out.println(cnt);
        }
    }
}