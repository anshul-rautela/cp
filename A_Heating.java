import java.util.Scanner;

public class A_Heating {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        while (n--!=0) {
            scn.nextLine();
            int c = scn.nextInt();
            int s = scn.nextInt();
        
            if(c>=s){
                System.out.println(s);
            }
            else{
                int rem = s%c;
                int div = s/c;
                if(rem==0){
                    System.out.println(div*div*c);
                }
                else{
                    System.out.println(div*div*(c-rem)+rem*(1+div)*(1+div));
                }

            }


        
        
        }
    }
}