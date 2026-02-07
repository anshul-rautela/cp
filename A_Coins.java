import java.util.Scanner;

public class A_Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long t = scanner.nextLong();
        while (t--!=0) {
            scanner.nextLine();
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if(k%2!=0&&n%2!=0){
                System.out.println("YES");
            }else if(k%2==0&&n%2==0){
                System.out.println("YES");
            }
            else if(k%2!=0&&n%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }




        }
    }
}