import java.util.Scanner;

public class A_Road_To_Zero {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            Long x = scn.nextLong();
            Long y = scn.nextLong();
            scn.nextLine();

            int a = scn.nextInt();
            int b = scn.nextInt();
            
            Long min = Math.min(x, y);
            Long max = Math.max(x, y);
            Long sol=0L;


            if(a*2>b){
                sol = min*b+(max-min)*a;
            }
            else{
                sol = a*(min+max);
            }
            System.out.println(sol);

        }
    }
}