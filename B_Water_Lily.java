import java.util.Scanner;

public class B_Water_Lily {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Double h = scn.nextDouble();
        Double l = scn.nextDouble();
    

        Double d = (l*l - h*h)/(2*h);
        System.out.println(d);
    
    
    }
}