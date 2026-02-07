import java.util.Scanner;

public class A_Chunga_Changa {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Long s = scn.nextLong();
        Long m = scn.nextLong();
        Long p = scn.nextLong();
        

        if(s%p==0||m%p==0){
            System.out.println(s/p+m/p+" "+0);
        }else{
            Long rs = s%p;
            Long rm = m%p;
            Long mr = Math.min(rs, rm);
            Long MR = Math.max(rs, rm);

            if(p-MR<=mr){
                System.out.println((s/p+m/p+1)+" "+(p-MR));
            }
            else  System.out.println((s/p+m/p)+" "+0);


        }



    }
}