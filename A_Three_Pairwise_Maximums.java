import java.util.Scanner;

public class A_Three_Pairwise_Maximums {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();

            if(a==b&&b==c&&c==a){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else if(a==b){
                if(a>c){
                    System.out.println("YES");
                    System.out.println(a+" "+c+" "+c);
                }
                else System.out.println("NO");
            }
            else if(c==b){
                if(a<c){
                    System.out.println("YES");
                    System.out.println(a+" "+a+" "+c);
                }
                else System.out.println("NO");
            }
            else if(a==c){
                if(a>b){
                    System.out.println("YES");
                    System.out.println(b+" "+a+" "+b);
                }
                else System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}