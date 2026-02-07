    import java.util.Scanner;
     
    public class A_Drazil_and_Date {
     
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            Long a =  scn.nextLong();
            Long b =  scn.nextLong();
            Long s = scn.nextLong();
            
            if(Math.abs(a)+Math.abs(b)>s || (Math.abs(a)+Math.abs(b))%2!=s%2){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }