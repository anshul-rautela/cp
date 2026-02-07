import java.util.Scanner;

public class B_Buttons {

    int cnt =0;
    
    static void f(int i,int cnt,int n){
        cnt++;
        if(i==n) return ;
        for(i =i+1;i<=n;i++){
            f(i,cnt,n);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        

        for(int i =1;i<=n;i++){
            f(i,cnt,n);
        }
        System.out.println(cnt);
    }
}