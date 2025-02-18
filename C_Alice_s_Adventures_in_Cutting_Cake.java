import java.util.ArrayList;
import java.util.Scanner;

public class C_Alice_s_Adventures_in_Cutting_Cake {
    public static void main(String[] args) {
        int t;
        Scanner scn = new Scanner(System.in);
        t=scn.nextInt();
        while(t--!=0){
            int n=scn.nextInt(),creatures=scn.nextInt(),min_taste=scn.nextInt();
            scn.nextLine();int m=n;
            int taste[]=new int[n];
            int i=0;
            while (n--!=0) {
                taste[i]=scn.nextInt();
                i++;
            }
            ArrayList<Integer>min_taste_arr=new ArrayList<>();
            int sum=0;
            n=m;
            for(i =0;i<n;i++){
                sum+=taste[i];
                if(sum>=min_taste){
                    min_taste_arr.add(sum);
                    sum=0;
                }
            }
            int sol=recur(min_taste_arr,);//complete recursive fn
            System.out.println(sol);
        }
    }
}