import java.util.*;
public class A_Theatre_Square {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Long n = scn.nextLong();

        Long m = scn.nextLong();
        Long s = scn.nextLong();

        Long k = n/s +1;
        Long k2 = m/s +1;
        
        if(n%s==0) k--;
        if(m%s==0) k2--;

        System.out.println(k*k2);
//x - = ++x - x ++ * x;
    }
}   