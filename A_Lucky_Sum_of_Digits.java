import java.util.Scanner;

public class A_Lucky_Sum_of_Digits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
            boolean found = false;
            int cnt7=0,j=0,k=0;
            if(n%7==0){
                for(int i =0;i<n/7;i++){
                    System.out.print(7);
                }
            }else{
            while (n>0) {
                if(n%4==0){  j = cnt7; k  =n/4; found = true;}
                n-=7;
                cnt7++;
                if(n<0)break;
            }
            if(!found) System.out.println(-1);
            else{                
                    for(int i =0;i<k;i++){
                        System.out.print(4);
                    }
                    for(int i =0;i<j;i++){
                        System.out.print(7);
                    }     
                    found = true;               
                }
            }
        

    }
}