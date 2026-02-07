import java.util.Scanner;

public class A_Balanced_Rating_Changes {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int k =0,k1=0;
        while (n--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            if(a%2==0) System.out.println(a/2);
            else{
                if(a<0){
                    if(k%2==0) System.out.println(a/2-1);
                    else System.out.println(a/2);

                k++;
                }
                else{
                    if(k1%2==0) System.out.println(a/2+1);
                    else System.out.println(a/2);
                    k1++;
                }
           }        
        }
    }
}