import java.util.Scanner;

public class B_Non_Coprime_Partition {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        if(n<3) System.out.println("No");
        else {
            System.out.println("Yes");
            if(n%2==0){
                System.out.print(n/2+" ");
                for(int i =2;i<=n;i+=2){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.print(n/2+" ");
                for(int i =1;i<=n;i+=2){
                    System.out.print(i+" ");
                }
            }
            else{
                System.out.print((n/2)+" ");
                for(int i =2;i<=n;i+=2){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.print((n/2+1)+" ");
                for(int i =1;i<=n;i+=2){
                    System.out.print(i+" ");
                }
            }
        }
    }
}