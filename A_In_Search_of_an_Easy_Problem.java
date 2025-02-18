import java.util.*;

public class A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int t = scn.nextInt();     while (t-- > 0)
            solve(scn);
           scn.close();
    }

    static void solve(Scanner scn){
        
        int n = scn.nextInt();
        scn.nextLine();
        for(int i =0;i<n;i++){
            int k = scn.nextInt();
            if(k==1){
                System.out.println("Hard");
                return;
            }
        }
        System.out.println("Easy");
    }
}