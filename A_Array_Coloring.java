import java.util.Scanner;

public class A_Array_Coloring {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int cnt =0;
            int n = scn.nextInt();
            for(int i =0;i<n;i++){
                if(scn.nextInt()%2!=0){
                    cnt++;
                }
            }
        if(cnt%2==0) System.out.println("YES");
        else System.out.println("NO");
        }

    }
}