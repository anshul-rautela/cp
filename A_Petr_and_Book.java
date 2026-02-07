import java.util.Scanner;

public class A_Petr_and_Book {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int page = scn.nextInt();

        int arr[] = new int[7];

        scn.nextLine();
        for(int i =0;i<7;i++){
            arr[i] = scn.nextInt();
        }
        boolean ans = false;
        int sol = -1;
        while(!ans){
            for(int i =1;i<=7;i++){
                page-=arr[i-1];
                if(page<=0){
                    sol = i;
                    ans = true;
                    break;
                }
            }
        }
        System.out.println(sol);

    }
}