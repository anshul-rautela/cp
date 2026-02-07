import java.util.*;

public class D_Destruction_of_the_Dandelion_Fields {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t--!=0){
            scn.nextLine();
            int n = scn.nextInt();
            scn.nextLine();
            int field[] = new int[n];
            int nodd=0;
            long minodd = Long.MAX_VALUE;
            long sum=0;
            List<Integer>odd= new ArrayList<>();
            for(int i =0;i<n;i++){
                field[i] = scn.nextInt();
                if(field[i]%2!=0){
                    odd.add(field[i]);
                    nodd++;
                }
                else  sum+=field[i];
            }
            Collections.sort(odd);
            if(nodd==0) System.out.println(0);
            else{
                int i =0;
                int j = nodd-1;
                while (i<=j) {
                    sum+=odd.get(j--);
                    i++;
                }
                System.out.println(sum);
            }


        
        }
    }
}