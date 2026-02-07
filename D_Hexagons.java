import java.util.Scanner;

public class D_Hexagons {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Long n = scn.nextLong();
        if(n==0) System.out.println(1);
        else {
            Long sol =1L;
            sol+= n*((12L+(n-1)*6)/2L);
            System.out.println((long)sol);
        }
    }
}