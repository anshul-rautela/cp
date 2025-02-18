import java.util.*;
public class A_MEX_Destruction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T=scn.nextInt();

        scn.nextLine();
        while(T--!=0){
            int sol=0;
            int n=scn.nextInt();
            scn.nextLine();
            int arr[]=new int[n];
            for(int i =0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int c0=0;
            int c1=0;
            Boolean l1=false;
            boolean r1=false;
            boolean m0=false;
            for(int i =0;i<n;i++){
                if(arr[i]==0){
                    c0++;
                }
                else{
                    c1++;
                }

                if(!l1&&arr[i]!=0){
                    l1=true;
                }
                else if(l1&&arr[i]==0){
                    m0=true;
                }
                else if(l1&&m0){
                    r1=true;
                }
            }
            if(c0==n)System.out.println(0);
            else if(c1==n)System.out.println(1);
            else if(l1&&m0&&r1){
                System.out.println(2);
            }
            else System.out.println(1);

    }    
}
}