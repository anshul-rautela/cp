import java.util.Scanner;

public class A_Line_Breaks {

    public static void main(String[] args) {
        int T ;
        Scanner scn = new Scanner(System.in);
        T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n,m;
            n = scn.nextInt();m = scn.nextInt();scn.nextLine();
            String s[]=new String[n];
            for(int i =0;i<n;i++){
                s[i]=scn.nextLine();
            }
            int mlen=0;
            int ans=0;
            for(int i =0;i<n;i++){
                if(s[i].length()+mlen<=m){
                    ans+=1;
                    mlen+=s[i].length();
                }
                else{
                    break;
                }
                            }
                            System.out.println(ans);

        }
    }
}