
import java.util.Scanner;

public class A_Unit_Array {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int morethanone =0,lessthanone = 0;
            for(int i =0;i<n;i++){
                if(scn.nextInt()>0){
                    morethanone++;
                }
                else{
                    lessthanone++;
                }
            }
            int cnt =0;
            while (morethanone<lessthanone) {
                morethanone++;
                cnt++;
                lessthanone--;
            }
            while (lessthanone%2!=0) {
                morethanone++;
                lessthanone--;
                cnt++;
            }
            System.out.println(cnt);
            
        }
    
    }
}
