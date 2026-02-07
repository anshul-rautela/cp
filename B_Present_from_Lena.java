import java.util.Scanner;

public class B_Present_from_Lena {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n*2;
        int cnt =-1;

        for(int i =0;i<=n;i++){
            cnt+=2;
            for(int j =0;j<sp;j++){
                System.out.print(' ');
            }
            for(int j =0;j<=i;j++){
                if(i==0)
                System.out.println(0);
                else
                System.out.print(j+" ");
            }

            for(int j =i-1;j>0;j--){
                System.out.print(j+" ");
            }
            if(i!=0)
            System.out.println(0);

            // for(int j =0;j<sp;j++){
            //     System.out.print(' ');
            // }
            sp-=2;
        }
        sp = 2;
        cnt-=2;
        for(int i =n-1;i>0;i--){
            cnt-=2;
            for(int j =0;j<sp;j++){
                System.out.print(' ');
            }
            for(int j =0;j<=i;j++){
                System.out.print(j+" ");
            }

            for(int j =i-1;j>0;j--){
                System.out.print(j+" ");
            }
            if(i!=0)
            System.out.println(0);

            // for(int j =0;j<sp;j++){
            //     System.out.print(' ');
            // }
            sp+=2;
        }
        
        for(int i =0;i<n*2;i++)
            System.out.print(" ");
        System.out.println(0);


        
    }
}