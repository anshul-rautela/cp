import java.util.Scanner;

public class A_Middle_of_the_Contest {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String f = scn.nextLine();
        String s = scn.nextLine();
        
        int n1 = (s.charAt(0)- '0')*10+(s.charAt(1)- '0');
        int n2 = (s.charAt(3)- '0')*10+s.charAt(4)- '0';

        
        n1*=60;
        n1+=n2;


        int n3 = (f.charAt(0)- '0')*10+f.charAt(1)- '0';
        int n4 = (f.charAt(3)- '0')*10+f.charAt(4)- '0';


        n3*=60;
        n3+=n4;

        int k = (n3+n1)/2;

        int h = k/60;
        int m = k%60;

        if(h>9&&m>9)
            System.out.println(h+":"+m);
        else if(m>9&&h<=9)
            System.out.println("0"+h+":"+m);
        else if(m<=9&&h>9)
            System.out.println(h+":0"+m);
        else if(m<=9&&h<=9)     System.out.println("0"+h+":0"+m);
        


    }
}