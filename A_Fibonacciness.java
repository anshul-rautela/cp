import java.util.*;
public class A_Fibonacciness {
public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();     scn.nextLine();     while (t-- > 0){
                solve(scn);scn.nextLine();}
               scn.close();
        }
       
        static void solve(Scanner scn){
            int []arr= new int[4];
            for(int i =0;i<4;i++){
                arr[i]=scn.nextInt();
            }
            int k1 = arr[0]+arr[1];
            int k2=arr[3]-arr[2];
            int k3 = arr[2]-arr[1];
            if(k1==k2&&k2==k3){
                System.out.println(3);
            }
            else if(k2==k1||k1==k3||k2==k3){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
