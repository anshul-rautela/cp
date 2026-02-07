import java.util.Scanner;

class A_Floor_Number{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            double n = scn.nextInt();
            double x = scn.nextInt();
            scn.nextLine();
            if(n>2)
            System.out.println((int)Math.ceil((n-2)/x+1));
            else System.out.println(1);
        }
        
    }
}